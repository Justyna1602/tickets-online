package com.ticketsOnline.services;

import com.ticketsOnline.entities.Event;
import com.ticketsOnline.repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventService {

    private EventRepository eventRepository;

    public List<Event> getAll() {
        return eventRepository.findAll();

    }


}
