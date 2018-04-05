package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;
import com.reservation.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl extends BaseServiceImpl<CinemaEntity, Integer> implements CinemaService {

//    @Autowired
//    public CinemaServiceImpl(CinemaDao dao) {
//        super(dao);
//    }

    //Сделать один вид конструктора во всех сервисах

    @Autowired
    public CinemaServiceImpl(BaseDao<CinemaEntity, Integer> dao) {
        super(dao);
    }


}
