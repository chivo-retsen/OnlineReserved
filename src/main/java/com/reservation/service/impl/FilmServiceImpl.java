package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.dao.FilmDao;
import com.reservation.entity.FilmEntity;
import com.reservation.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl extends BaseServiceImpl<FilmEntity, Integer> implements FilmService {

    @Autowired
    public FilmServiceImpl(BaseDao<FilmEntity, Integer> dao) {
        super(dao);
    }

}
