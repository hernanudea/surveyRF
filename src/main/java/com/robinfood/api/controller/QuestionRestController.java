package com.robinfood.api.controller;

import com.robinfood.api.repository.entity.QuestionPOJO;
import com.robinfood.api.service.IQuestionService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("questions")
public class QuestionRestController {

    private IQuestionService questionService;

    private final Log LOGGER = LogFactory.getLog(QuestionRestController.class);

    public QuestionRestController(IQuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("")
    private ResponseEntity<?> findAll() {
        LOGGER.info("#### En el metodo findAll");
        Map<String, Object> response = new HashMap<>();
        List<QuestionPOJO> list = null;
        try {
            list = questionService.findAll();
            LOGGER.info("#### list: " + list.size());
        } catch (Exception e) {
            LOGGER.info("#### error" + e.getMessage().concat(": ").concat(e.getLocalizedMessage()));
            response.put("message", "Error al realizar la consulta de las preguntas para la encuenta");
            LOGGER.error("error", e);
        }
        if (list == null || list.size()==0) {
            LOGGER.info("#### vacio");
            response.put("message", "No se han creado preguntas en base de datos para mostrar!");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        response.put("questions", list);
        for (QuestionPOJO q : list) {
            LOGGER.info("#### Question:" + q.toString());
        }
        LOGGER.info("#### response ok");
        return new ResponseEntity<List<QuestionPOJO>>(list, HttpStatus.OK);
    }
}
