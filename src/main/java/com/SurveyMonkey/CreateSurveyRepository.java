package com.SurveyMonkey;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "createSurvey")
public interface CreateSurveyRepository extends CrudRepository<CreateSurvey, Long> {
}
