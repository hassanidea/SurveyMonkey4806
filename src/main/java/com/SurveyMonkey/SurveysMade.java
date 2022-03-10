package com.SurveyMonkey;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class SurveysMade {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<CreateSurveyModel> surveys;
    public SurveysMade(){
        surveys = new ArrayList<CreateSurveyModel>();
    }

    public List<CreateSurveyModel> getSurveys() {
        return surveys;
    }

    public void setSurveys(List<CreateSurveyModel> surveys) {
        this.surveys = surveys;
    }

    public List<CreateSurveyModel> getSurveyList(){
        return this.surveys;
    }

    public void addSurvey(CreateSurveyModel survey){
        surveys.add(survey);
    }

    public void removeSurvey(CreateSurveyModel survey){
        surveys.remove(survey);
    }


    public static void main(String[] args) {

    }

}
