package com.SurveyMonkey.repositories;

import com.SurveyMonkey.model.DropDownQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "questions", path = "dropdown")
public interface DropDownRepository extends CrudRepository<DropDownQuestion, Long> {
}
