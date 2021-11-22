package com.robinfood.api.service;

import com.robinfood.api.repository.entity.QuestionTypePOJO;
import com.robinfood.api.repository.entity.SurveyPOJO;

import java.util.List;

public interface ISurveyService {
    List<SurveyPOJO> findAll();

    SurveyPOJO findOne(Long idSurvey);

    SurveyPOJO save(SurveyPOJO survey);

    void delete(Long idSurvey);
}
