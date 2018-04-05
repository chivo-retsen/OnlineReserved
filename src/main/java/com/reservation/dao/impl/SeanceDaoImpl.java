package com.reservation.dao.impl;

import com.reservation.dao.SeanceDao;
import com.reservation.dao.SeatDao;
import com.reservation.entity.SeanceEntity;
import org.springframework.stereotype.Repository;

@Repository
public class SeanceDaoImpl extends BaseDaoImpl<SeanceEntity, Integer> implements SeanceDao {

    SeanceDaoImpl() {
        super(SeanceEntity.class);
    }
}
