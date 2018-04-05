package com.reservation.entity;

import javax.persistence.*;

@Entity
@Table(name = "reserved_ticket", schema = "reserved_tickets", catalog = "")
public class ReservedTicketEntity {
    private int id;
    private int code;
    private int value;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code", nullable = false)
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Basic
    @Column(name = "value", nullable = false)
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReservedTicketEntity that = (ReservedTicketEntity) o;

        if (id != that.id) return false;
        if (code != that.code) return false;
        if (value != that.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + code;
        result = 31 * result + value;
        return result;
    }
}
