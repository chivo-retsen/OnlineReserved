package com.reservation.service.impl;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;
import com.reservation.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {


    @Autowired
   // @Qualifier("getCinemaDao")    // or @Qualifier("cinemaDaoImpl")
    private CinemaDao cinemaDao;

//    public void setCinemaDao(CinemaDao cinemaDao) {
//        this.cinemaDao = cinemaDao;
//    }

    @Transactional
    public void create(CinemaEntity cinemaEntity) {
        this.cinemaDao.create(cinemaEntity);
    }

    @Transactional
    public CinemaEntity read(int id) {
        return this.cinemaDao.read(id);
    }

    @Transactional
    public void update(CinemaEntity cinemaEntity) {
        this.cinemaDao.update(cinemaEntity);
    }

    @Transactional
    public void delete(int id) {
        this.cinemaDao.delete(id);
    }


    public List getAll() {
        return this.cinemaDao.getAll();
    }
}
