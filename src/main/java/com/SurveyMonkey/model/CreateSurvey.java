package com.SurveyMonkey.model;

import com.SurveyMonkey.model.questions.types.QType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CreateSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<QType> questionsMade;

    public CreateSurvey() {
        questionsMade = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<QType> getQuestions() {
        return questionsMade;
    }

    // This method would return all the open ended questions
    public List<OpenEndedQuestion> getOpenEndedQuestions() {
        return OpenEndedQuestion;
    }

    public void setQuestions(List<QType> questionsMade) {
        this.questionsMade = questionsMade;
    }

    public void setOpenEndedQuestions(List<OpenEndedQuestion> OpenEndedQuestion) {
        this.OpenEndedQuestion = OpenEndedQuestion;
    }

    public void addQuestion(QType question) {
        questionsMade.add(question);
    }

    public void removeQuestion(QType question) {
        questionsMade.remove(question);
    }

    @Override
    public String toString() {
        return String.format(
                "Number of questions: [number=%d]\nQ1: %s",
                this.questionsMade.size(), this.questionsMade.get(0));
    }

}
