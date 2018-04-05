package com.reservation.dao.impl;

import com.reservation.dao.IndividualCabinetDao;
import com.reservation.entity.IndividualCabinetEntity;
import org.springframework.stereotype.Repository;

@Repository
public class IndividualCabinetDaoImpl extends BaseDaoImpl<IndividualCabinetEntity, Integer> implements IndividualCabinetDao {

    IndividualCabinetDaoImpl() {
        super(IndividualCabinetEntity.class);
    }
}
