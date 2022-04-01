package com.SurveyMonkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TakerController {

    @GetMapping("/surveyResults")
    public String showSurveyResults(){
        return "surveyResults";
    }

    @GetMapping("/takerHome")
    public String takerHome(){
        return "takerHome";
    }

    @GetMapping("/takerSurveyPage")
    public String takerSurvey(){
        return "takerSurveyPage";
    }
}
