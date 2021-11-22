package com.robinfood.api.service.impl;

import com.robinfood.api.repository.dao.IQuestionDAO;
import com.robinfood.api.repository.entity.QuestionPOJO;
import com.robinfood.api.service.IQuestionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionService {

    private IQuestionDAO questionDAO;

    public QuestionServiceImpl(IQuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }


    @Override
    @Transactional(readOnly = true)
    public List<QuestionPOJO> findAll() {
        return questionDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public QuestionPOJO findOne(Long idQuestion) {
        return questionDAO.findById(idQuestion).orElse(null);
    }

    @Override
    public QuestionPOJO save(QuestionPOJO question) {
        return questionDAO.save(question);
    }

    @Override
    public void delete(Long idQuestion) {
        questionDAO.deleteById(idQuestion);
    }
}
