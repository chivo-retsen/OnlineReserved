package com.reservation.service.impl;

import com.reservation.dao.BaseDao;
import com.reservation.dao.ReservedTicketDao;
import com.reservation.entity.ReservedTicketEntity;
import com.reservation.service.ReservedTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservedTicketServiceImpl extends BaseServiceImpl<ReservedTicketEntity, Integer> implements ReservedTicketService {

    @Autowired
    public ReservedTicketServiceImpl(ReservedTicketDao dao) {
        super(dao);
    }
}
