package com.reservation.dao.impl;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;

import org.springframework.stereotype.Repository;

@Repository
public class CinemaDaoImpl extends BaseDaoImpl<CinemaEntity, Integer> implements CinemaDao {

    public CinemaDaoImpl(){
        super(CinemaEntity.class);
    }

}
