package com.SurveyMonkey.model;

import com.SurveyMonkey.model.answers.Answers;
import com.SurveyMonkey.model.questions.Questions;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "surveys")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToOne(targetEntity=Questions.class, fetch=FetchType.EAGER)
    private Questions questions;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToOne(targetEntity=Answers.class, fetch=FetchType.EAGER)
    private Answers answers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
