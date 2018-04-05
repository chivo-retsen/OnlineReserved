package com.reservation.dao.impl;

import com.reservation.dao.ReservedTicketDao;
import com.reservation.entity.ReservedTicketEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ReservedTicketDaoImpl extends BaseDaoImpl<ReservedTicketEntity, Integer> implements ReservedTicketDao {

    ReservedTicketDaoImpl() {
        super(ReservedTicketEntity.class);
    }
}
