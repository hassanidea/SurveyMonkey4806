package com.SurveyMonkey.controller;

import java.util.ArrayList;
import java.util.List;

import com.SurveyMonkey.Service.ServiceResponse;
import com.SurveyMonkey.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultipleChoiceQuestionController {

	List<MultipleChoiceQuestionModel> mcQuestions = new ArrayList<>();
	@Autowired
	private CreateSurveyRepository createSurveyRepository;
	@Autowired
	private MultipleChoiceRepository multipleChoiceRepository;


	@PostMapping("/saveQuestion")
	public ResponseEntity<Object> addQuestion(@RequestBody MultipleChoiceQuestionModel mcq) {
		mcQuestions.add(mcq);
		ServiceResponse<MultipleChoiceQuestionModel> response = new ServiceResponse<MultipleChoiceQuestionModel>("success", mcq);
		if (createSurveyRepository.count()==0) {
			CreateSurvey createSurvey = new CreateSurvey();
			createSurvey.addQuestion(mcq);
			multipleChoiceRepository.save(mcq);
			createSurveyRepository.save(createSurvey);
		}
		else{
			CreateSurvey createSurvey = createSurveyRepository.findAll().iterator().next();
			createSurvey.addQuestion(mcq);
			multipleChoiceRepository.save(mcq);
			createSurveyRepository.save(createSurvey);
		}

		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

	@GetMapping("/getQuestions")
	public ResponseEntity<Object> getAllQuestions() {
		ServiceResponse<List<MultipleChoiceQuestionModel>> response = new ServiceResponse<>("success", mcQuestions);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}
}
