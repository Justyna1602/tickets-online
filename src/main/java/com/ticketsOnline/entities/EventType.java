package com.ticketsOnline.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private Integer ageLimit;

    public String getFullEventType() {
        return "Opis: " + description + '\'' +
                ", Minimalny wiek uczestnika" + ageLimit +
                '}';
    }
}
