package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.dao.SeanceDao;
import com.reservation.entity.SeanceEntity;
import com.reservation.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeanceServiceImpl extends BaseServiceImpl<SeanceEntity, Integer> implements SeanceService {

    @Autowired
    public SeanceServiceImpl(SeanceDao dao) {
        super(dao);
    }
}
