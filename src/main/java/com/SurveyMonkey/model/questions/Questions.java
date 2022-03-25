package com.SurveyMonkey.model.questions;

import com.SurveyMonkey.model.questions.types.QType;

import javax.persistence.*;
import java.util.HashMap;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @SuppressWarnings("JpaAttributeTypeInspection")
    private HashMap<Integer, QType> questions;

    public Questions() {
    }

    public HashMap<Integer, QType> getQuestions() {
        return questions;
    }

    public void setQuestions(HashMap<Integer, QType> questions) {
        this.questions = questions;
    }
}
