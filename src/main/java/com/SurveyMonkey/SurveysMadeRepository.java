package com.SurveyMonkey;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

 @RepositoryRestResource(collectionResourceRel = "people", path = "surveysDone")
    public interface SurveysMadeRepository extends CrudRepository<SurveysMade, Long> {
}
