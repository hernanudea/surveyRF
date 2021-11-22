package com.robinfood.api.repository.dao;

import com.robinfood.api.repository.entity.QuestionTypePOJO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionTypeDAO extends JpaRepository<QuestionTypePOJO, Long> {
}
