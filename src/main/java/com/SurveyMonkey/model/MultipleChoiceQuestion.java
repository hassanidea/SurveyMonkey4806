package com.SurveyMonkey.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MultipleChoiceQuestion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String surveyQuestion;
	private String choiceOne;
	private String choiceTwo;
	private String choiceThree;
	private String choiceFour;


	protected MultipleChoiceQuestion() {}

	public MultipleChoiceQuestion(String surveyQuestion, String choiceOne, String choiceTwo, String choiceThree, String choiceFour) {
		this.surveyQuestion = surveyQuestion;
		this.choiceOne = choiceOne;
		this.choiceTwo = choiceTwo;
		this.choiceThree = choiceThree;
		this.choiceFour = choiceFour;
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
				"Question: [id=%d, question='%s', choice1='%s', choice2='%s',choice3='%s',choice4='%s']",
				id, surveyQuestion, choiceOne,choiceTwo,choiceThree,choiceFour);
	}

}
