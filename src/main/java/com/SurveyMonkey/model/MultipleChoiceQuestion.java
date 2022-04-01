package com.SurveyMonkey.model;

import com.SurveyMonkey.model.questions.types.QType;

import javax.persistence.Entity;

@Entity
public class MultipleChoiceQuestion extends QType {

	private Integer number;
	private String surveyQuestion;
	private String choiceOne;
	private String choiceTwo;
	private String choiceThree;
	private String choiceFour;

	public MultipleChoiceQuestion() {

	}

	public MultipleChoiceQuestion(Integer number, String surveyQuestion, String choiceOne, String choiceTwo,
			String choiceThree, String choiceFour) {
		this.number = number;
		this.surveyQuestion = surveyQuestion;
		this.choiceOne = choiceOne;
		this.choiceTwo = choiceTwo;
		this.choiceThree = choiceThree;
		this.choiceFour = choiceFour;
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

	public String getChoiceOne() {
		return choiceOne;
	}

	public void setChoiceOne(String choiceOne) {
		this.choiceOne = choiceOne;
	}

	public String getChoiceTwo() {
		return choiceTwo;
	}

	public void setChoiceTwo(String choiceTwo) {
		this.choiceTwo = choiceTwo;
	}

	public String getChoiceThree() {
		return choiceThree;
	}

	public void setChoiceThree(String choiceThree) {
		this.choiceThree = choiceThree;
	}

	public String getChoiceFour() {
		return choiceFour;
	}

	public void setChoiceFour(String choiceFour) {
		this.choiceFour = choiceFour;
	}

	@Override
	public String toString() {
		return String.format(
				"Question: [id=%d, number='%s', question='%s', choice1='%s', choice2='%s',choice3='%s',choice4='%s']",
				this.getId(), number, surveyQuestion, choiceOne, choiceTwo, choiceThree, choiceFour);
	}

}
