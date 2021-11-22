package com.robinfood.api.service;

import com.robinfood.api.repository.entity.QuestionTypePOJO;

import java.util.List;

public interface IQuestionTypeService {

    public List<QuestionTypePOJO> findAll();

    public QuestionTypePOJO findOne(Long idQuestionType);

    public QuestionTypePOJO save(QuestionTypePOJO questionType);

    public void delete(Long idQuestionType);

}
