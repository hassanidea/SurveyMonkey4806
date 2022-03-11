package com.SurveyMonkey.model;

import com.SurveyMonkey.model.CreateSurvey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "createSurveyData")
public interface CreateSurveyRepository extends CrudRepository<CreateSurvey, Long> {

}
