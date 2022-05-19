package com.ticketsOnline.services;

import com.ticketsOnline.entities.Event;
import com.ticketsOnline.repositories.EventRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class EventService {

    private EventRepository eventRepository;

    public List<Event> getAll() {
        return eventRepository.findAll();

    }

    public Event getById(Integer id) {
        return eventRepository.getById(id);
    }

    public void addEvent(Event event) {
        if (event.getId() == null) {
            eventRepository.save(event);
        } else {
            IllegalArgumentException exception = new IllegalArgumentException("Wybrane wydarzenie jest już utworzone");
            log.error("Wydarzenie nie zostało utworzone");
            throw exception;
        }
    }

    public void delete(Event event) {
        if (event.getId() != null) {
            eventRepository.delete(event);
        } else {
            IllegalArgumentException exception = new IllegalArgumentException("wybrane wydarzenie nie istnieje");
            log.error("Wydarzenie nie zostało usunięte");
            throw exception;
        }
    }


}
