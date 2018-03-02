package com.reservation.service;

import com.reservation.entity.CinemaEntity;

public interface CinemaService extends BaseService{

    //create
    void create(CinemaEntity cinemaEntity);

    //read
    CinemaEntity read(long id);

    //update
    void update(CinemaEntity cinemaEntity);

    //delete
    void delete(long id); //проверить принимаемые параметры (long id) или (CinemaEntity cinemaEntity)
}
