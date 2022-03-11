package com.SurveyMonkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MultipleChoiceController {

    @Autowired
    private CreateSurveyRepository createSurveyRepository;
    @Autowired
    private MultipleChoiceRepository multipleChoiceRepository;

    @GetMapping("/createSurvey")
    public String greetingForm(Model model) {
        model.addAttribute("multipleChoiceQuestion", new MultipleChoiceQuestion());
        return "createSurvey";
    }

    @PostMapping("/createSurvey")
    public String greetingSubmit(@ModelAttribute @RequestBody MultipleChoiceQuestion mcqQuestion, Model model) {
        if (createSurveyRepository.count()==0) {
            CreateSurvey createSurvey = new CreateSurvey();
            createSurvey.addQuestion(mcqQuestion);
            multipleChoiceRepository.save(mcqQuestion);
            createSurveyRepository.save(createSurvey);
        }
        else{
            CreateSurvey createSurvey = createSurveyRepository.findAll().iterator().next();
            createSurvey.addQuestion(mcqQuestion);
            multipleChoiceRepository.save(mcqQuestion);
            createSurveyRepository.save(createSurvey);
        }
        model.addAttribute("multipleChoiceQuestion", mcqQuestion);
        return "confirmationPage";
    }
}