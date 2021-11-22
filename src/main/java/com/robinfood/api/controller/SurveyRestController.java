package com.robinfood.api.controller;

import com.robinfood.api.repository.entity.SurveyPOJO;
import com.robinfood.api.service.ISurveyService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("survey")
public class SurveyRestController {

    private ISurveyService surveyService;

    private final Log LOGGER = LogFactory.getLog(SurveyRestController.class);

    public SurveyRestController(ISurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @PostMapping("")
    private ResponseEntity<?> save(@Validated @RequestBody SurveyPOJO survey, BindingResult result) {
        LOGGER.info("#### Guardando la encuenta: " + survey.toString());
        Map<String, Object> response = new HashMap<>();
        if (result.hasErrors()) {
            List<String> errors = result.getFieldErrors().stream()
                    .map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());
            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        SurveyPOJO newSurvey = null;
        try {
            newSurvey = surveyService.save(survey);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert de la encuesta en la base de datos");
            LOGGER.error(e);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("message", "La Encuenta ha sido creada/actualizada con éxito!");
        response.put("survey", newSurvey);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }
}
