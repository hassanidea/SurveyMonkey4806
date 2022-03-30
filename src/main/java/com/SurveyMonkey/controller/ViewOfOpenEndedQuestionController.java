package com.SurveyMonkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewOfOpenEndedQuestionController {

    @GetMapping("/openEndedQuestion")
    public String home() {
        return "openEndedQuestion";
    }

}
