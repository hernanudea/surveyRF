package com.robinfood.api.service;

import com.robinfood.api.repository.entity.QuestionPOJO;

import java.util.List;

public interface IQuestionService {
    List<QuestionPOJO> findAll();

    QuestionPOJO findOne(Long idQuestion);

    QuestionPOJO save(QuestionPOJO question);

    void delete(Long idQuestion);

}
