package com.reservation.dao.impl;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaDaoImpl extends BaseDaoImpl implements CinemaDao {

//    @Autowired
//    public JdbcTemplate jdbcTemplate;

    private static final Logger logger = LoggerFactory.getLogger(CinemaDaoImpl.class);

//    @Autowired
//    public CinemaDaoImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }




    public void create(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(cinemaEntity);
        session.getTransaction().commit();
        logger.info("Кинотеатр успешно добавлен. Информация о кинотеатре: " + cinemaEntity);
    }

    public CinemaEntity read(int id) {
        Session session = getSessionAndBeginTransaction();
        CinemaEntity cinemaEntity = session.get(CinemaEntity.class,id);   // =session.load(CinemaEntity.class,new Integer(id)); проверить надобность new Integer(id) или можно просто id
        session.getTransaction().commit();
        logger.info("Кинотеатр успешно загружен. Информация о кинотеатре: " + cinemaEntity);
        return cinemaEntity;
    }

    public void update(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(cinemaEntity);
        session.getTransaction().commit();
        logger.info("Информация о кинотеатре успешно обновлена. Информация о кинотеатре: " + cinemaEntity);
    }

    public void delete(int id) {
        Session session = getSessionAndBeginTransaction();
        CinemaEntity cinemaEntity = session.get(CinemaEntity.class,id);
        session.delete(cinemaEntity);                                 //перепроверить параметры  cinemaEntity or id
        session.getTransaction().commit();
        logger.info("Кинотеатр успешно удалён. Информация о кинотеатре: " + id);
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (CinemaEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        logger.info("список кинотеатров");
        session.getTransaction().commit();
        return list;
    }
}
