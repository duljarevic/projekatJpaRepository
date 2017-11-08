package com.dejan.dejan.users;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USERS", schema = "proba")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "hiber_seq")
    @SequenceGenerator(name = "hiber_seq", sequenceName = "HIBERNATE_SEQUENCE")
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
