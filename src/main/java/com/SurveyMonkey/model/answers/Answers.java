package com.SurveyMonkey.model.answers;

import com.SurveyMonkey.model.answers.types.AType;

import javax.persistence.*;
import java.util.HashMap;

@Entity
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column
    @SuppressWarnings("JpaAttributeTypeInspection")
    private HashMap<Integer, AType> answers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Answers() {
    }

    public HashMap<Integer, AType> getAnswers() {
        return answers;
    }

    public void setAnswers(HashMap<Integer, AType> answers) {
        this.answers = answers;
    }
}
