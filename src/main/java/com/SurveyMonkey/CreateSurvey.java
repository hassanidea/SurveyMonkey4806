package com.SurveyMonkey;

import javax.persistence.*;
import java.util.List;

@Entity
public class CreateSurvey {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private int numberOfQuestions;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<MultipleChoiceQuestion> multipleChoiceQuestions;

    @ManyToOne
    @JoinColumn(name = "mcq_question_id")
    private MultipleChoiceQuestion mcqQuestion;

    protected CreateSurvey() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public List<MultipleChoiceQuestion> getMultipleChoiceQuestions() {
        return multipleChoiceQuestions;
    }

    public void setMultipleChoiceQuestions(List<MultipleChoiceQuestion> multipleChoiceQuestions) {
        this.multipleChoiceQuestions = multipleChoiceQuestions;
    }

    public MultipleChoiceQuestion getMcqQuestion() {
        return mcqQuestion;
    }

    public void setMcqQuestion(MultipleChoiceQuestion mcqQuestion) {
        this.mcqQuestion = mcqQuestion;
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
                "Questions number is: [number=%d]",
                this.numberOfQuestions);
    }

}
