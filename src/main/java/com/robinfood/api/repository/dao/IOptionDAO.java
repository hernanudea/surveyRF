package com.robinfood.api.repository.dao;

import com.robinfood.api.repository.entity.OptionPOJO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOptionDAO extends JpaRepository<OptionPOJO, Long> {

}
