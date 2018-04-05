package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.entity.SeatEntity;
import com.reservation.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatServiceImpl extends BaseServiceImpl<SeatEntity, Integer> implements SeatService {

    @Autowired
    public SeatServiceImpl(BaseDao<SeatEntity, Integer> dao) {
        super(dao);
    }
}
