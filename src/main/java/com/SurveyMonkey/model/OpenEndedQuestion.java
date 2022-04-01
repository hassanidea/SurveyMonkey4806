package com.SurveyMonkey.model;

import com.SurveyMonkey.model.questions.types.QType;

import javax.persistence.Entity;

@Entity
public class OpenEndedQuestion extends QType {
    private Integer number;
    private String surveyQuestion;
    private String openEndedAnswer;

    public OpenEndedQuestion() {}

    public OpenEndedQuestion(Integer number, String surveyQuestion, String openEndedAnswer) {
        this.number = number;
        this.surveyQuestion = surveyQuestion;
        this.openEndedAnswer = openEndedAnswer;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(String question) {
        this.surveyQuestion = question;
    }

    public String getOpenEndedAnswer() {
        return openEndedAnswer;
    }

    public void setOpenEndedAnswer(String choiceOne) {
        this.openEndedAnswer = choiceOne;
    }


    @Override
    public String toString() {
        return String.format(
                "Question: [id=%d, number='%s', question='%s', OpenEndedAnswer='%s']",
                getId(), number, surveyQuestion, openEndedAnswer);
    }



}
