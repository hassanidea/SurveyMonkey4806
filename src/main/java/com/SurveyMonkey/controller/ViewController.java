package com.SurveyMonkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/createSurveyQuestion")
	public String home() {
		return "createSurveyQuestion";
	}

}
