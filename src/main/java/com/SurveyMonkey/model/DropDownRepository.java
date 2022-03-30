package com.SurveyMonkey.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "questions", path = "dropdown")
public interface DropDownRepository extends CrudRepository<DropDownQuestion, Long> {
}
