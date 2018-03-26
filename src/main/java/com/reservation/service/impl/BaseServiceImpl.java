package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.dao.impl.CinemaDaoImpl;
import com.reservation.entity.CinemaEntity;
import com.reservation.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

    @Autowired
    private BaseDao<T,PK> baseDao;

    public BaseServiceImpl(BaseDao<T,PK> daoClass) {
        this.baseDao = daoClass;
    }

    @Transactional   //18:50 Spring Generic DAO And Generic Service Implementation
    public void create(T entity) {
        baseDao.create(entity);
    }

    @Transactional
    public T read(PK id) {
        return baseDao.read(id);
    }

    @Transactional
    public void update(T entity) {
        baseDao.update(entity);
    }

    @Transactional
    public void delete(PK id) {
        baseDao.delete(id);
    }

    @Transactional
    public List<T> getAll() {
        return baseDao.getAll();
    }
}
