package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional(readOnly=true)                //18:50 Spring Generic DAO And Generic Service Implementation
public abstract class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

    private BaseDao<T,PK> dao;

    //@Autowired
    public BaseServiceImpl(BaseDao<T,PK> dao) {
        this.dao = dao;
    }


    public void create(T entity) {
        dao.create(entity);
    }

    public T read(PK id) {
        return dao.read(id);
    }

    public void update(T entity) {
        dao.update(entity);
    }

    public void delete(PK id) {
        dao.delete(id);
    }

    public List<T> getAll() {
        return dao.getAll();
    }
}
