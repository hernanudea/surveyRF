package com.robinfood.api.service;

import com.robinfood.api.repository.entity.OptionPOJO;

import java.util.List;

public interface IOptionService {
    List<OptionPOJO> findAll();

    OptionPOJO findOne(Long idOption);

    OptionPOJO save(OptionPOJO option);

   void delete(Long idOption);

}
