package com.SurveyMonkey.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "mcqData")
public interface MultipleChoiceRepository extends CrudRepository<MultipleChoiceQuestionModel, Long> {
}
