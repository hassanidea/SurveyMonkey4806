package com.SurveyMonkey.controller;

import com.SurveyMonkey.model.CreateSurvey;
import com.SurveyMonkey.model.CreateSurveyRepository;
import com.SurveyMonkey.model.MultipleChoiceQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.Properties;


@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class EditControllerHttpTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private CreateSurveyRepository surveyRepository;

    @Test
    public void editControllerShouldReturnErrorPage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/editSurvey",
                String.class)).contains("Error Occurred");
    }

    @Test
    public void editControllerShowsSurvey() throws Exception {
        CreateSurvey s = new CreateSurvey();
        MultipleChoiceQuestion q1 = new MultipleChoiceQuestion(1, "SurveyQuestion 1", "1", "2", "3", "4");
        s.addQuestion(q1);
        String id = surveyRepository.save(s).getId().toString();

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/editSurvey?id="+id,
                String.class)).contains("SurveyQuestion 1");
    }

}