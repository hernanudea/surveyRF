package com.robinfood.api.service.impl;

import com.robinfood.api.repository.dao.IOptionDAO;
import com.robinfood.api.repository.entity.OptionPOJO;
import com.robinfood.api.service.IOptionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OptionServiceImpl implements IOptionService {

    private IOptionDAO optionDAO;

    public OptionServiceImpl(IOptionDAO optionDAO) {
        this.optionDAO = optionDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<OptionPOJO> findAll() {
        return optionDAO.findAll();
    }

    @Override
    public OptionPOJO findOne(Long idOption) {
        return optionDAO.findById(idOption).orElse(null);
    }


    @Override
    public OptionPOJO save(OptionPOJO option) {
        return optionDAO.save(option);
    }

    @Override
    public void delete(Long idOption) {
        optionDAO.deleteById(idOption);
    }
}
