//package com.SurveyMonkey;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Entity
//public class SurveysMade {
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private int id;
//    @OneToMany(cascade = CascadeType.PERSIST)
//    private List<CreateSurvey> surveys;
//    public SurveysMade(){
//        surveys = new ArrayList<CreateSurvey>();
//    }
//
//    public List<CreateSurvey> getSurveys() {
//        return surveys;
//    }
//
//    public void setSurveys(List<CreateSurvey> surveys) {
//        this.surveys = surveys;
//    }
//
//    public List<CreateSurvey> getSurveyList(){
//        return this.surveys;
//    }
//
//    public void addSurvey(CreateSurvey survey){
//        surveys.add(survey);
//    }
//
//    public void removeSurvey(CreateSurvey survey){
//        surveys.remove(survey);
//    }
//
//
//    public static void main(String[] args) {
//
//    }
//
//}
