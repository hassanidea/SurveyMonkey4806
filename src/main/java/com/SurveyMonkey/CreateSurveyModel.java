package com.SurveyMonkey;

import javax.persistence.*;
import java.util.List;

@Entity
public class CreateSurveyModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private int numberOfQuestions;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<MultipleChoiceQuestion> multipleChoiceQuestions;

    @ManyToOne
    @JoinColumn(name = "mcq_question_id")
    private MultipleChoiceQuestion mcqQuestion;

    protected CreateSurveyModel() {}

    public CreateSurveyModel(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public List<MultipleChoiceQuestion> getMcqQuestions() {
        return this.multipleChoiceQuestions;
    }

    public void setMcqQuestions(String question,String choiceOne,String choiceTwo,String choiceThree,String choiceFour) {
        if (this.multipleChoiceQuestions.size()<this.numberOfQuestions) {
            this.mcqQuestion.setQuestion(question);
            this.mcqQuestion.setChoiceOne(choiceOne);
            this.mcqQuestion.setChoiceTwo(choiceTwo);
            this.mcqQuestion.setChoiceThree(choiceThree);
            this.mcqQuestion.setChoiceFour(choiceFour);
        }
        else{
            System.out.println("You stated "+ this.numberOfQuestions+" number of questions");
        }
    }

    public Long getId() {
        return id;
    }


    @Override
    public String toString() {
        return String.format(
                "Questions number is: [number=%d]",
                this.numberOfQuestions);
    }

}
