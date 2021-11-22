package com.robinfood.api.repository.dao;

import com.robinfood.api.repository.entity.OptionPOJO;
import com.robinfood.api.repository.entity.SurveyPOJO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISurveyDAO extends JpaRepository<SurveyPOJO, Long> {

}
