package com.SurveyMonkey.model.questions.types;

import java.util.ArrayList;

public class QRadio extends QType {
    private ArrayList<String> options;


    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }
}
