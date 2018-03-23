package com.reservation.dao.impl;

import com.reservation.dao.BaseDao;
import com.reservation.utils.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class BaseDaoImpl implements BaseDao {

    public Session getSessionAndBeginTransaction(){
        SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
        if(sessionFactory == null){
            throw new RuntimeException("Session factory is null");

        }

        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
        }catch (HibernateException e) {
            e.printStackTrace();
        }
        return session;
    }
}
