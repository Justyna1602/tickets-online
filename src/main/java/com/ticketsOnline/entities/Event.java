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
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String date;
    private String eventType; // zmiana typu prz robieniu zlączeń!
    private String place;
    private Integer numberOfParticipants;
    private boolean availability;


}
