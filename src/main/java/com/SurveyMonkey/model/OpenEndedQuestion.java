package com.SurveyMonkey.model;

import com.SurveyMonkey.model.questions.types.QType;

import javax.persistence.Entity;

@Entity
public class OpenEndedQuestion extends QType {

    private String surveyQuestion;
    private String openEndedAnswer;

    public OpenEndedQuestion() {}

    public OpenEndedQuestion(Integer number, String surveyQuestion, String openEndedAnswer) {
        this.setNumber(number);
        this.setQuestion(surveyQuestion);
        this.openEndedAnswer = openEndedAnswer;

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
                getId(), getNumber(), surveyQuestion, openEndedAnswer);
    }

}
