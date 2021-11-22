package com.robinfood.api.repository.dao;

import com.robinfood.api.repository.entity.QuestionPOJO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionDAO extends JpaRepository<QuestionPOJO, Long> {

}
