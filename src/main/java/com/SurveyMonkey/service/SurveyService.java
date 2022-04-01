package com.SurveyMonkey.service;

import com.SurveyMonkey.model.CreateSurvey;
import com.SurveyMonkey.repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {
    @Autowired private SurveyRepository surveyRepo;

    /**
     * Method: Get List of all Surveys
     * @return List of all Surveys
     */
    public List<CreateSurvey> listAll() {
        return (List<CreateSurvey>) surveyRepo.findAll();
    }

    /**
     * Method: Get Survey by ID
     * @return Individual Survey
     */
    public CreateSurvey get(Integer Id){
        Optional<CreateSurvey> survey = surveyRepo.findById(Id);
        return survey.get();
    }
}
