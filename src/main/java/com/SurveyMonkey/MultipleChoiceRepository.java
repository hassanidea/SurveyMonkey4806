package com.SurveyMonkey;

import java.util.List;

import com.SurveyMonkey.MultipleChoiceQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "mcqData")
public interface MultipleChoiceRepository extends CrudRepository<MultipleChoiceQuestion, Long> {
}
