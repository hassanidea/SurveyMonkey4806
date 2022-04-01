package com.SurveyMonkey.repositories;

import com.SurveyMonkey.model.MultipleChoiceQuestionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "mcqData")
public interface MultipleChoiceRepository extends CrudRepository<MultipleChoiceQuestionModel, Long> {
}
