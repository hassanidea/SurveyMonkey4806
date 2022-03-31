package com.SurveyMonkey.controller;

import com.SurveyMonkey.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class DropDownQuestionController {
    List<DropDownQuestion> dropDownQuestions = new ArrayList<>();
    @Autowired
    private CreateSurveyRepository createSurveyRepository;
    @Autowired
    private DropDownRepository dropDownRepository;


    @PostMapping("/saveDropDownQuestion")
    public ResponseEntity<Object> addQuestion(@RequestBody DropDownQuestion dropDown) {
        dropDownQuestions.add(dropDown);
        ServiceResponse<DropDownQuestion> response = new ServiceResponse<DropDownQuestion>("success", dropDown);
        if (createSurveyRepository.count()==0) {
            CreateSurvey createSurvey = new CreateSurvey();
            createSurvey.addQuestion(dropDown);
            dropDownRepository.save(dropDown);
            createSurveyRepository.save(createSurvey);
        }
        else{
            CreateSurvey createSurvey = createSurveyRepository.findAll().iterator().next();
            createSurvey.addQuestion(dropDown);
            dropDownRepository.save(dropDown);
            createSurveyRepository.save(createSurvey);
        }

        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    @GetMapping("/getDropDownQuestions")
    public ResponseEntity<Object> getAllQuestions() {
        ServiceResponse<List<DropDownQuestion>> response = new ServiceResponse<>("success", dropDownQuestions);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }
}
