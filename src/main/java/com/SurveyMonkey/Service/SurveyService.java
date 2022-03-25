package com.SurveyMonkey.Service;

import com.SurveyMonkey.model.Survey;
import com.SurveyMonkey.repository.SurveyRepository;
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
    public List<Survey> listAll() {
        return (List<Survey>) surveyRepo.findAll();
    }

    /**
     * Method: Get Survey by ID
     * @return Individual Survey
     */
    public Survey get(Integer Id){
        Optional<Survey> survey = surveyRepo.findById(Id);
        return survey.get();
    }
}
