package com.SurveyMonkey.controller;

import com.SurveyMonkey.model.CreateSurvey;
import com.SurveyMonkey.model.CreateSurveyRepository;
import com.SurveyMonkey.model.MultipleChoiceQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class EditController {

    @Autowired
    private CreateSurveyRepository surveyRepository;

    @RequestMapping("/editSurvey")
    public String edit(HttpServletRequest req, Model m) {
//        if (req.getParameter("id") == null)
//            return "errorPage";
//
//        Long surveyId = Long.valueOf(req.getParameter("id"));
        CreateSurvey s = new CreateSurvey();
        MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("q1", "1", "2","3","4");
        MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("q2", "a", "b","c","d");
        s.addQuestion(q1);
        s.addQuestion(q2);
        surveyRepository.save(s);

        Long surveyId = 0L;
        Optional<CreateSurvey> selectedSurvey = surveyRepository.findById(surveyId);

        if(selectedSurvey.isPresent()) {
            CreateSurvey survey = selectedSurvey.get();
            m.addAttribute("questions", survey.getMultipleChoiceQuestions());
            return "surveyorEdit";
        } else {
            return "errorPage";
        }
    }

}
