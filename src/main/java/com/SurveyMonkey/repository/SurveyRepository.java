package com.SurveyMonkey.repository;

import com.SurveyMonkey.model.Survey;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SurveyRepository extends CrudRepository<Survey, Integer> {
    Survey findById(Long id);

}
