package com.SurveyMonkey.model;

import com.SurveyMonkey.model.answers.Answers;
import com.SurveyMonkey.model.questions.Questions;

public class Survey {
    private Questions questions;
    private Answers answers;

    public Survey() {
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public Answers getAnswers() {
        return answers;
    }

    public void setAnswers(Answers answers) {
        this.answers = answers;
    }
}
