package com.reservation.dao;

import com.reservation.entity.CinemaEntity;

public interface CinemaDao extends BaseDao {

    //create
    void create(CinemaEntity cinemaEntity);

    //read
    CinemaEntity read(int id);

    //update
    void update(CinemaEntity cinemaEntity);

    //delete
    void delete(int id);
}
