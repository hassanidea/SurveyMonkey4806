package com.SurveyMonkey.model.answers;

import com.SurveyMonkey.model.answers.types.AType;

import java.util.HashMap;

public class Answers {

    private HashMap<Integer, AType> answers;

    public Answers() {
    }

    public HashMap<Integer, AType> getAnswers() {
        return answers;
    }

    public void setAnswers(HashMap<Integer, AType> answers) {
        this.answers = answers;
    }
}
