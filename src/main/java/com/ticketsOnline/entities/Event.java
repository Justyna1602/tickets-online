package com.ticketsOnline.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String date;
    @ManyToOne
    private EventType eventType;
    private String place;
    private Integer numberOfParticipants;
    @ManyToOne
    private User savedUser;
    private boolean availability;



}
