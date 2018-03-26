package com.reservation.dao.impl;

import com.reservation.dao.BaseDao;
import com.reservation.entity.CinemaEntity;
import com.reservation.utils.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public abstract class BaseDaoImpl<T, PK extends Serializable> implements BaseDao<T, PK> {

    private Class<T> aClass;

    BaseDaoImpl(Class<T> aClass){
        this.aClass = aClass;
    }

    @Override
    public void create(T entity) {
        Session session = getSessionAndBeginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

    @Override
    public T read(PK id) {
        Session session = getSessionAndBeginTransaction();
        T entity = session.get(aClass, id);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public void update(T entity) {
        Session session = getSessionAndBeginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    @Override
    public void delete(int id) {
        Session session = getSessionAndBeginTransaction();
        T entity = session.get(aClass,id);
        session.delete(entity);
        session.getTransaction().commit();
    }

    @Override
    public List<T> getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (aClass.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List<T> list = query.list();
        session.getTransaction().commit();
        return list;
    }




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
