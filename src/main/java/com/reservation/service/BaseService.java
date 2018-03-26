package com.reservation.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T, PK extends Serializable> {

    //create
    void create(T entity);

    //read
    T read(PK id);

    //update
    void update(T entity);

    //delete
    void delete(int id);

    //list
    List<T> getAll();
}
