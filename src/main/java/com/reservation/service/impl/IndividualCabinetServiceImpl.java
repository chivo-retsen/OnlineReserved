package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.dao.IndividualCabinetDao;
import com.reservation.entity.IndividualCabinetEntity;
import com.reservation.service.IndividualCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndividualCabinetServiceImpl extends BaseServiceImpl<IndividualCabinetEntity, Integer> implements IndividualCabinetService {

    @Autowired
    public IndividualCabinetServiceImpl(IndividualCabinetDao dao) {
        super(dao);
    }
}
