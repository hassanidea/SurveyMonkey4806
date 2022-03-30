package com.SurveyMonkey.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OpenEndedQuestion {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Integer number;
    private String surveyQuestion;
    private String openEndedAnswer;

    public OpenEndedQuestion() {}

    public OpenEndedQuestion(Integer number, String surveyQuestion, String openEndedAnswer) {
        this.number = number;
        this.surveyQuestion = surveyQuestion;
        this.openEndedAnswer = openEndedAnswer;

    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                id, number, surveyQuestion, openEndedAnswer);
    }

}
