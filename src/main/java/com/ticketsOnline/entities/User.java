package com.ticketsOnline.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
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
    @ManyToOne
    private Event event;


    public String user() {
        return "User: " + getFirstName() + " " + getLastName();
    }

}
