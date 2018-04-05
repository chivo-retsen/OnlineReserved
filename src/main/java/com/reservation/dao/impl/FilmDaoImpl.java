package com.reservation.dao.impl;

import com.reservation.dao.FilmDao;
import com.reservation.entity.FilmEntity;

import org.springframework.stereotype.Repository;

@Repository
public class FilmDaoImpl extends BaseDaoImpl<FilmEntity, Integer> implements FilmDao {

    public FilmDaoImpl() {
        super(FilmEntity.class);
    }

}
