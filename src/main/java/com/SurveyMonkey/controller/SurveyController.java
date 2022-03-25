package com.SurveyMonkey.controller;

import com.SurveyMonkey.Service.SurveyService;
import com.SurveyMonkey.model.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SurveyController {
    @Autowired private SurveyService service;

    @GetMapping("/surveyResults/{id}")
    public String displaySurveyResults(@PathVariable("id") Integer id, Model model) {
        Survey survey = service.get(id);
        model.addAttribute("survey", survey);
        model.addAttribute("title_page", "Survey Results");
        return "surveyResults";
    }


}
