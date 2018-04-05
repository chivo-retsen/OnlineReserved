package com.reservation.dao.impl;

import com.reservation.dao.SeatDao;
import com.reservation.entity.SeatEntity;
import org.springframework.stereotype.Repository;

@Repository
public class SeatDaoImpl extends BaseDaoImpl<SeatEntity, Integer> implements SeatDao {

    SeatDaoImpl() {
        super(SeatEntity.class);
    }
}
