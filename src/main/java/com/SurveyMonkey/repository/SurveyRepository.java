package com.SurveyMonkey.repository;

import com.SurveyMonkey.model.CreateSurvey;
import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<CreateSurvey, Integer> {
    CreateSurvey findById(Long id);

}
