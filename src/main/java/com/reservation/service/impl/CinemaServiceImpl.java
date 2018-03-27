package com.reservation.service.impl;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;
import com.reservation.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CinemaServiceImpl extends BaseServiceImpl<CinemaEntity, Integer> implements CinemaService {

    @Autowired
    public CinemaServiceImpl(CinemaDao cinemaDao) {
        super(cinemaDao);
    }

//    @Autowired
//    public CinemaServiceImpl(BaseDao<CinemaEntity, Integer> daoClass) {
//        super(daoClass);
//    }


}
