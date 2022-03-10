package com.SurveyMonkey.model.questions.types;

public abstract class QType {
    private int number;
    private String question;

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
