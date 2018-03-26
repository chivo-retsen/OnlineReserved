package com.reservation.dao.impl;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaDaoImpl extends BaseDaoImpl<CinemaEntity, Integer> implements CinemaDao {

    public CinemaDaoImpl(){
        super(CinemaEntity.class);
    }


}
