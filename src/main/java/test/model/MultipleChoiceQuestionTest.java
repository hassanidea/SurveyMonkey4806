package test.model;

import com.SurveyMonkey.model.MultipleChoiceQuestionModel;

import static org.junit.Assert.*;
import java.util.*;

public class MultipleChoiceQuestionTest {

    MultipleChoiceQuestionModel mcQuestion = new MultipleChoiceQuestionModel();

    @org.junit.Test
    public void addQuestion() {
        mcQuestion.setQuestion("Test");
        assertEquals("Test",mcQuestion.getQuestion());
    }

    @org.junit.Test
    public void addFirstChoice() {
        mcQuestion.setChoiceOne("Test 1");
        assertEquals("Test 1",mcQuestion.getChoiceOne());
    }

    @org.junit.Test
    public void addSecondChoice() {
        mcQuestion.setChoiceTwo("Test 2");
        assertEquals("Test 2",mcQuestion.getChoiceOne());
    }

    @org.junit.Test
    public void addThirdChoice() {
        mcQuestion.setChoiceOne("Test 3");
        assertEquals("Test 3",mcQuestion.getChoiceOne());
    }

    @org.junit.Test
    public void addFourthChoice() {
        mcQuestion.setChoiceOne("Test 4");
        assertEquals("Test 4",mcQuestion.getChoiceOne());
    }




}