package com.robinfood.api.service.impl;

import com.robinfood.api.repository.dao.IQuestionTypeDAO;
import com.robinfood.api.repository.entity.QuestionTypePOJO;
import com.robinfood.api.service.IQuestionTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionTypeServiceImpl implements IQuestionTypeService {
    private IQuestionTypeDAO questionTypeDAO;


    @Override
    @Transactional(readOnly = true)
    public List<QuestionTypePOJO> findAll() {
        return questionTypeDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public QuestionTypePOJO findOne(Long idQuestionType) {
        return questionTypeDAO.findById(idQuestionType).orElse(null);
    }

    @Override
    public QuestionTypePOJO save(QuestionTypePOJO questionType) {
        return questionTypeDAO.save(questionType);
    }

    @Override
    public void delete(Long idQuestionType) {
        questionTypeDAO.deleteById(idQuestionType);
    }


}
