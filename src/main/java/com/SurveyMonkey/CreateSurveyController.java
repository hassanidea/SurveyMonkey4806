//package com.SurveyMonkey;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//
//@Controller
//public class CreateSurveyController {
//
//    @Autowired
//    private CreateSurveyRepository createSurveyRepository;
//
//    @Autowired
//    private SurveysMadeRepository surveysMadeRepository;
//
//    @GetMapping("/createSurvey")
//    public String questionsForm(Model model) {
//        model.addAttribute("createSurvey", new CreateSurvey());
//        return "createSurvey";
//    }
//
//    @PostMapping("/createSurvey")
//    public String questionsSubmit (@ModelAttribute @RequestBody CreateSurvey createdSurvey, Model model) {
//        if (createSurveyRepository.count()==0) {
//            SurveysMade surveysMade = new SurveysMade();
//            surveysMade.addSurvey(createdSurvey);
//            createSurveyRepository.save(createdSurvey);
//            surveysMadeRepository.save(surveysMade);
//        }
//        else{
//            SurveysMade surveysMade = surveysMadeRepository.findAll().iterator().next();
//            surveysMade.addSurvey(createdSurvey);
//            createSurveyRepository.save(createdSurvey);
//            surveysMadeRepository.save(surveysMade);
//        }
//        model.addAttribute("createSurvey", createdSurvey);
//        return "confirmationPage";
//    }
//
//}