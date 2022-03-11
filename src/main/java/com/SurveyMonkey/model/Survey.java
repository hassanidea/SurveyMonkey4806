package com.SurveyMonkey.model;

import com.SurveyMonkey.model.answers.Answers;
import com.SurveyMonkey.model.questions.Questions;

import java.util.ArrayList;

public class Survey {
    private Questions questions;
    private ArrayList<Answers> answers;

    public Survey() {
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public ArrayList<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answers> answers) {
        this.answers = answers;
    }
}
