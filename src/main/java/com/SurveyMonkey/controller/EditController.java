package com.SurveyMonkey.controller;

import com.SurveyMonkey.model.CreateSurvey;
import com.SurveyMonkey.model.CreateSurveyRepository;
import com.SurveyMonkey.model.MultipleChoiceQuestionModel;
import com.SurveyMonkey.model.MultipleChoiceRepository;
import com.SurveyMonkey.model.questions.types.QType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Optional;

@Controller
public class EditController {

    @Autowired
    private CreateSurveyRepository surveyRepository;

    @Autowired
    private MultipleChoiceRepository mcRepository;

    private Long activeId;

    @RequestMapping(value = "/editSurvey", method = RequestMethod.GET)
    public String edit(HttpServletRequest req, Model m) {
        // TODO: REMOVE WHEN NO LONGER NEEDED
        // TEMPORARY CODE BLOCK TO CREATE A SURVEY WITH WHILE WE AWAIT THE WEB PAGE TO
        // DO IT
        // WHEN YOU NAVIGATE TO :8080/editSurvey
        // IT CREATES THE SURVEY AS SEEN BELOW
        // CHECK THE SERVER LOGS FOR THE TEST ID TO NAVIGATE TO
        // :8080/editSurvey?id=<TEST SURVEY ID HERE>
        // THEN EDIT THE SURVEY, AND RETURN TO :8080/editSurvey?id=<TEST SURVEY ID HERE>
        // TO SEE THE CHANGE
        if (req.getParameter("id") == null) {
            CreateSurvey s = new CreateSurvey();
            MultipleChoiceQuestionModel q1 = new MultipleChoiceQuestionModel(1, "q1", "1", "2", "3", "4");
            MultipleChoiceQuestionModel q2 = new MultipleChoiceQuestionModel(2, "q2", "a", "b", "c", "d");
            s.addQuestion(q1);
            s.addQuestion(q2);
            CreateSurvey c = surveyRepository.save(s);
            System.out.println("TEST SURVEY ID: " + c.getId());
        } else {
            // GET THE ID VALUE FROM THE REQUEST PARAMS
            Long surveyId = Long.valueOf(req.getParameter("id"));

            Optional<CreateSurvey> selectedSurvey = surveyRepository.findById(surveyId);

            if (selectedSurvey.isPresent()) {
                CreateSurvey survey = selectedSurvey.get();
                activeId = surveyId;
                m.addAttribute("questions", survey.getQuestions());
                return "surveyorEdit";
            } else {
                return "errorPage";
            }
        }
        return "errorPage";
    }

    @RequestMapping(value = "/confirmEditSurvey", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String editSubmit(@RequestBody MultiValueMap<String, String> formData,
            BindingResult result) {
        if (result.hasErrors()) {
            return "errorPage";
        }

        Optional<CreateSurvey> s = surveyRepository.findById(activeId);

        if (s.isPresent()) {
            CreateSurvey survey = s.get();

            // THE FORM SHOULD GIVE 5 VALUES PER QUESTION
            if (formData.size() % 5 != 0)
                return "errorPage";

            ArrayList<QType> newQuestions = new ArrayList<>();
            int i = 1;

            while (!formData.isEmpty()) {
                MultipleChoiceQuestionModel newQuestion = new MultipleChoiceQuestionModel();

                // SET THE NEW QUESTION ID TO THE SAME AS THE OLD ONE FOR JPA
                newQuestion.setId(survey.getQuestions().get(i - 1).getId());

                String number = Integer.toString(i);
                newQuestion.setNumber(i);

                // FIND EACH VALUE IN THE MULTIVALUE MAP FOR EACH FIELD IN
                // MULTIPLECHOICEQUESTION
                newQuestion.setQuestion(formData.getFirst("surveyQuestion" + number));
                formData.remove("surveyQuestion" + number);

                newQuestion.setChoiceOne(formData.getFirst("choiceOne" + number));
                formData.remove("choiceOne" + number);

                newQuestion.setChoiceTwo(formData.getFirst("choiceTwo" + number));
                formData.remove("choiceTwo" + number);

                newQuestion.setChoiceThree(formData.getFirst("choiceThree" + number));
                formData.remove("choiceThree" + number);

                newQuestion.setChoiceFour(formData.getFirst("choiceFour" + number));
                formData.remove("choiceFour" + number);

                // ADD THE QUESTION TO THE NEW LIST FOR THE SURVEY
                newQuestions.add(newQuestion);

                // PERSIST THE NEW QUESTION AT THE SAME ID AS THE PREVIOUS QUESTION
                mcRepository.save(newQuestion);
                i++;
            }
            // SET THE QUESTIONS LISTS
            survey.setQuestions(newQuestions);

            // PERSIST THE SURVEY
            surveyRepository.save(survey);

            return "editConfirmation";
        } else {
            return "errorPage";
        }
    }
}
