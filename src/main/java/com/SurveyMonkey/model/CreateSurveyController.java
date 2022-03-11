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
//    @GetMapping("/createSurvey")
//    public String questionsForm(Model model) {
//        model.addAttribute("createSurvey", new CreateSurveyModel());
//        return "createSurvey";
//    }
//
//    @PostMapping("/createSurvey")
//    public String questionsSubmit (@ModelAttribute @RequestBody CreateSurveyModel createSurvey, Model model) {
//        if (createSurveyRepository.count()==0) {
//            SurveysMade surveysMade = new SurveysMade();
//            SurveysMade.addSurvey(buddyInfo);
//            buddyInfoRepository.save(buddyInfo);
//            addressBookRepo.save(addressBook);
//        }
//        else{
//            AddressBook addressBook = addressBookRepo.findAll().iterator().next();
//            addressBook.addBuddy(buddyInfo);
//            buddyInfoRepository.save(buddyInfo);
//            addressBookRepo.save(addressBook);
//        }
//        model.addAttribute("buddyInfo", buddyInfo);
//        return "result";
//    }
//
//}