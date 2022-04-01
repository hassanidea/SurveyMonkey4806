package com.SurveyMonkey.model.questions.types;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class QType {
    private int number;
    private String question;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public long getId(){
        return this.id;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
