package com.robinfood.api.service;

import com.robinfood.api.repository.entity.QuestionTypePOJO;

import java.util.List;

public interface IQuestionTypeService {

    List<QuestionTypePOJO> findAll();

    QuestionTypePOJO findOne(Long idQuestionType);

    QuestionTypePOJO save(QuestionTypePOJO questionType);

    void delete(Long idQuestionType);

}
