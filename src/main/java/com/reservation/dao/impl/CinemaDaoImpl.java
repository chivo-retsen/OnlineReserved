package com.reservation.dao.impl;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaDaoImpl extends BaseDaoImpl implements CinemaDao {

    private static final Logger logger = LoggerFactory.getLogger(CinemaDaoImpl.class);


    //@Override /должно появляться автоматически или прописывать?
    public void create(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(cinemaEntity);
        session.getTransaction().commit();
        logger.info("Кинотеатр успешно добавлен. Информация о кинотеатре: " + cinemaEntity);
    }

    public CinemaEntity read(long id) {
        Session session = getSessionAndBeginTransaction();
        CinemaEntity Cinema = session.get(CinemaEntity.class,id);
        session.getTransaction().commit();
        logger.info("Кинотеатр успешно загружен. Информация о кинотеатре: " + Cinema);
        return Cinema;
    }

    public void update(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(cinemaEntity);
        session.getTransaction().commit();
        logger.info("Информация о кинотеатре успешно обновлена. Информация о кинотеатре: " + cinemaEntity);
    }

    public void delete(long id) {
        Session session = getSessionAndBeginTransaction();
        session.delete(id);                                 //перепроверить параметры  cinemaEntity or id
        session.getTransaction().commit();
        logger.info("Кинотеатр успешно удалён. Информация о кинотеатре: " + id);
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (CinemaEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        // logger.info();
        session.getTransaction().commit();
        return list;
    }
}
