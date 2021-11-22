package com.robinfood.api.controller;

import com.robinfood.api.repository.entity.QuestionPOJO;
import com.robinfood.api.service.IQuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class QuestionRestControllerTest {

    @Mock
    IQuestionService questionService;

    @Test
    void assertNotFound(){

        List<QuestionPOJO> list = new ArrayList<>();
        Mockito.when(questionService.findAll()).thenReturn(list);

        QuestionRestController questionRestController = new QuestionRestController(questionService);
        ResponseEntity<?> response = questionRestController.findAll();
        assertNotNull(response);
        assertEquals(response.getStatusCode().getReasonPhrase(), HttpStatus.NOT_FOUND.getReasonPhrase());
    }

    @Test
    void assertQuestionsFound(){
        QuestionPOJO questionPOJO1 = new QuestionPOJO();
        questionPOJO1.setIdQuestion(01L);
        questionPOJO1.setQuestion("Pregunta Numero 1");
        QuestionPOJO questionPOJO2 = new QuestionPOJO();
        questionPOJO2.setIdQuestion(01L);
        questionPOJO2.setQuestion("Pregunta Numero 2");
        List<QuestionPOJO> list = new ArrayList<>();
        list.add(questionPOJO1);
        list.add(questionPOJO2);

        Mockito.when(questionService.findAll()).thenReturn(list);

        QuestionRestController questionRestController = new QuestionRestController(questionService);
        ResponseEntity<?> response = questionRestController.findAll();
        assertNotNull(response);
        assertEquals(response.getStatusCode().getReasonPhrase(), HttpStatus.OK.getReasonPhrase());
    }

}