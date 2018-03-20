package com.reservation.entity;

import javax.persistence.*;

@Entity
@Table(name = "cinema")
public class CinemaEntity extends BaseEntity {


    @Basic
    @Column(name = "id")
    private long id;

    @Basic  //расширить знания
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "address")
    private String address;


//    public CinemaEntity() {
//    }

    @Override
    public long getId() {
    return id;
}

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
