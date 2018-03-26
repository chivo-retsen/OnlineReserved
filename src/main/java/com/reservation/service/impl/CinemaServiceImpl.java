package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.dao.CinemaDao;
import com.reservation.dao.impl.CinemaDaoImpl;
import com.reservation.entity.CinemaEntity;
import com.reservation.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CinemaServiceImpl extends BaseServiceImpl<CinemaEntity, Integer> implements CinemaService {


    public CinemaServiceImpl(BaseDao<CinemaEntity, Integer> daoClass) {
        super(daoClass);
    }

//    @Autowired
//    private CinemaDao cinemaDao;
//
//    @Transactional
//    public void create(CinemaEntity cinemaEntity) {
//        cinemaDao.create(cinemaEntity);
//    }
//
//    @Transactional
//    public CinemaEntity read(int id) {
//        return cinemaDao.read(id);
//    }
//
//    @Transactional
//    public void update(CinemaEntity cinemaEntity) {
//        cinemaDao.update(cinemaEntity);
//    }
//
//    @Transactional
//    public void delete(int id) {
//        cinemaDao.delete(id);
//    }
//
//    @Transactional
//    public List getAll() {
//        return cinemaDao.getAll();
//    }
}
