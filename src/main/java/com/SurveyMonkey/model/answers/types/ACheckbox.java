package com.SurveyMonkey.model.answers.types;

import java.util.ArrayList;

public class ACheckbox extends AType {

    private ArrayList<String> answer;

    public ACheckbox() {
        answer = new ArrayList<>();
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answers) {
        this.answer = answers;
    }
}
