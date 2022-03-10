package com.SurveyMonkey.model.questions;

import com.SurveyMonkey.model.questions.types.QType;

import java.util.HashMap;

public class Questions {

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
