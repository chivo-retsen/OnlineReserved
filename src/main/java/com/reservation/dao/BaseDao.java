package com.reservation.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao <T, PK extends Serializable> {

    //create
    void create(T entity);

    //read
    T read(PK id);

    //update
    void update(T entity);

    //delete
    void delete(PK id);

    //list
    List<T> getAll();
}
