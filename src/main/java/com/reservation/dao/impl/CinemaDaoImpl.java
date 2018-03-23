package com.reservation.dao.impl;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaDaoImpl extends BaseDaoImpl implements CinemaDao {

    public void create(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(cinemaEntity);
        session.getTransaction().commit();
    }

    public CinemaEntity read(int id) {
        Session session = getSessionAndBeginTransaction();
        CinemaEntity cinemaEntity = session.get(CinemaEntity.class,id);
        session.getTransaction().commit();
        return cinemaEntity;
    }

    public void update(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(cinemaEntity);
        session.getTransaction().commit();
    }

    public void delete(int id) {
        Session session = getSessionAndBeginTransaction();
        CinemaEntity cinemaEntity = session.get(CinemaEntity.class,id);
        session.delete(cinemaEntity);
        session.getTransaction().commit();
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (CinemaEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        session.getTransaction().commit();
        return list;
    }
}
