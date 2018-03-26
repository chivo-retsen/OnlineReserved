package com.reservation.entity;

import javax.persistence.*;
import java.io.Serializable;

//@Entity
@MappedSuperclass
public abstract class BaseEntity  {//implements Serializable

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
