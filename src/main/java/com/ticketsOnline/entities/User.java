package com.ticketsOnline.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String firstName;
    private String  lastName;
    private String mail;
    private String password;
    private String street;
    private String city;


    public String user() {
        return "User: " + getFirstName() + " " + getLastName();
    }

}
