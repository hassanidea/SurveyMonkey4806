package com.SurveyMonkey.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CreateSurvey {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    //  private int numberOfQuestions;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<MultipleChoiceQuestion> multipleChoiceQuestions;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<DropDownQuestion> dropDownQuestions;


    public CreateSurvey() {
        multipleChoiceQuestions= new ArrayList<>();
        dropDownQuestions= new ArrayList<DropDownQuestion>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<MultipleChoiceQuestion> getMultipleChoiceQuestions() {
        return multipleChoiceQuestions;
    }

    public List<DropDownQuestion> getDropDownQuestionsQuestions() {
        return dropDownQuestions;
    }

    public void setMultipleChoiceQuestions(List<MultipleChoiceQuestion> multipleChoiceQuestions) {
        this.multipleChoiceQuestions = multipleChoiceQuestions;
    }

    public void setDropDownQuestionsQuestions(List<DropDownQuestion> dropDownQuestions) {
        this.dropDownQuestions = dropDownQuestions;
    }


    public void addQuestion(MultipleChoiceQuestion mcqQuestion){
        multipleChoiceQuestions.add(mcqQuestion);
    }

    public void addQuestion(DropDownQuestion dropDownQuestion){
        dropDownQuestions.add(dropDownQuestion);
    }

    public void removeQuestion(MultipleChoiceQuestion mcq){
        multipleChoiceQuestions.remove(mcq);
    }

    public void removeQuestion(DropDownQuestion dropDownQuestion){
        dropDownQuestions.remove(dropDownQuestion);
    }


    @Override
    public String toString() {
        return String.format(
                "Number of questions: [number=%d]\nQ1: %s",
                this.multipleChoiceQuestions.size(), this.multipleChoiceQuestions.get(0));
    }

}
