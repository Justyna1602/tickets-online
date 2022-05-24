package com.ticketsOnline.services;

import com.ticketsOnline.entities.Event;
import com.ticketsOnline.repositories.EventRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class EventService {

    private EventRepository eventRepository;
    private UserService userService;


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

    public void update(Event event) {
        if (event.getId() != null) {
            Event updatedEvent = eventRepository.getById(event.getId());
            updatedEvent.setTitle(event.getTitle());
            updatedEvent.setDate(event.getDate());
            updatedEvent.setEventType(event.getEventType());
            updatedEvent.setPlace(event.getPlace());
            updatedEvent.setNumberOfParticipants(event.getNumberOfParticipants());
            updatedEvent.setCustomer(event.getCustomer());
            updatedEvent.setAvailability(event.isAvailability());

        }

    }


}
