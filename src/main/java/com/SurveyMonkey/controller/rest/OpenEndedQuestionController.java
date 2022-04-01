package com.SurveyMonkey.controller.rest;

import java.util.ArrayList;
import java.util.List;

import com.SurveyMonkey.repositories.CreateSurveyRepository;
import com.SurveyMonkey.repositories.OpenEndedQuestionRepository;
import com.SurveyMonkey.controller.response.ServiceResponse;
import com.SurveyMonkey.model.*;
import com.SurveyMonkey.model.QType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenEndedQuestionController {

    List<QType> openEndedQuestionsArray = new ArrayList<>();
    @Autowired
    private CreateSurveyRepository createSurveyRepository;
    @Autowired
    private OpenEndedQuestionRepository openEndedQuestionRepository;


    @PostMapping("/saveOpenEndedQuestion")
    public ResponseEntity<Object> addQuestion(@RequestBody OpenEndedQuestion openEndedQuestion) {
        openEndedQuestionsArray.add(openEndedQuestion);
        ServiceResponse<OpenEndedQuestion> response = new ServiceResponse<OpenEndedQuestion>("success", openEndedQuestion);
        if (createSurveyRepository.count()==0) {
            CreateSurvey createSurvey = new CreateSurvey();
            createSurvey.addQuestion(openEndedQuestion);
            openEndedQuestionRepository.save(openEndedQuestion);
            createSurveyRepository.save(createSurvey);
        }
        else{
            CreateSurvey createSurvey = createSurveyRepository.findAll().iterator().next();
            createSurvey.addQuestion(openEndedQuestion);
            openEndedQuestionRepository.save(openEndedQuestion);
            createSurveyRepository.save(createSurvey);
        }

        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    @GetMapping("/getOpenEndedQuestions")
    public ResponseEntity<Object> getAllQuestions() {
        ServiceResponse<List<QType>> response = new ServiceResponse<>("success", openEndedQuestionsArray);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }
}
