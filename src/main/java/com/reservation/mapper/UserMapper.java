package com.reservation.mapper;

import com.reservation.entity.CinemaEntity;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<CinemaEntity> {

//    @Nullable
//    public CinemaEntity mapRow(ResultSet resultSet, int i) throws SQLException {
//        return null;
//    }

    public CinemaEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        CinemaEntity cinemaEntity = new CinemaEntity();
        cinemaEntity.setId(resultSet.getInt("id"));
        cinemaEntity.setName(resultSet.getString("name"));
        cinemaEntity.setAddress(resultSet.getString("address"));

        return cinemaEntity;
    }
}
