package com.robinfood.api.service.impl;

import com.robinfood.api.repository.dao.ISurveyDAO;
import com.robinfood.api.repository.entity.SurveyPOJO;
import com.robinfood.api.service.ISurveyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SurveyServiceImpl implements ISurveyService {

    private ISurveyDAO surveyDAO;

    public SurveyServiceImpl(ISurveyDAO surveyDAO) {
        this.surveyDAO = surveyDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<SurveyPOJO> findAll() {
        return surveyDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public SurveyPOJO findOne(Long idSurvey) {
        return surveyDAO.findById(idSurvey).orElse(null);
    }

    @Override
    public SurveyPOJO save(SurveyPOJO survey) {
        return surveyDAO.save(survey);
    }

    @Override
    public void delete(Long idSurvey) {
        surveyDAO.deleteById(idSurvey);
    }
}
