package com.SurveyMonkey.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.SurveyMonkey.controller.SurveyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class SurveyControllerTests {

    @Autowired
    private SurveyController surveyController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(surveyController).isNotNull();
    }
}
