package com.robinfood.api.service;

import com.robinfood.api.repository.entity.QuestionPOJO;

import java.util.List;

public interface IQuestionService {
    public List<QuestionPOJO> findAll();

    public QuestionPOJO findOne(Long idQuestion);

    public QuestionPOJO save(QuestionPOJO question);

    public void delete(Long idQuestion);

}
