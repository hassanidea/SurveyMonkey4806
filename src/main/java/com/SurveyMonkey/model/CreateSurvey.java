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



    public CreateSurvey() {
        multipleChoiceQuestions= new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public int getNumberOfQuestions() {
//        return numberOfQuestions;
//    }
//
//    public void setNumberOfQuestions(int numberOfQuestions) {
//        this.numberOfQuestions = numberOfQuestions;
//    }

    public List<MultipleChoiceQuestion> getMultipleChoiceQuestions() {
        return multipleChoiceQuestions;
    }

    public void setMultipleChoiceQuestions(List<MultipleChoiceQuestion> multipleChoiceQuestions) {
        this.multipleChoiceQuestions = multipleChoiceQuestions;
    }


    public void addQuestion(MultipleChoiceQuestion mcqQuestion){
        multipleChoiceQuestions.add(mcqQuestion);
    }

    public void removeQuestion(MultipleChoiceQuestion mcq){
        multipleChoiceQuestions.remove(mcq);
    }


    @Override
    public String toString() {
        return String.format(
                "Number of questions: [number=%d]\nQ1: %s",
                this.multipleChoiceQuestions.size(), this.multipleChoiceQuestions.get(0));
    }

}
