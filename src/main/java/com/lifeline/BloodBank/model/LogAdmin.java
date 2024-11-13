package com.lifeline.BloodBank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "logadmin")
public class LogAdmin {
    @Id
    private int id;
    @Column
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        password = password;
    }

    public LogAdmin(int id, String password) {
        this.id = id;
        password = password;
    }

    public LogAdmin() {
    }
}
