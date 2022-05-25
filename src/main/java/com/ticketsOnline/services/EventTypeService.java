package com.ticketsOnline.services;

import com.ticketsOnline.entities.EventType;
import com.ticketsOnline.repositories.EventTypeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EventTypeService {
    private EventTypeRepository eventTypeRepository;

    public EventTypeService(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
    }

    public List<EventType> getAll() {
        return eventTypeRepository.findAll();
    }

    public EventType getById(Integer id) {
        return eventTypeRepository.getById(id);

    }

    public void addEventType(EventType eventType) {
        if (eventType.getId() == null) {
            eventTypeRepository.save(eventType);
        } else {
            IllegalArgumentException exception = new IllegalArgumentException("wybrany typ już istnieje");
            log.error("Typ nie został dodany");
            throw exception;
        }
    }

    public void delete(EventType eventType) {
        if (eventType.getId() != null) {
            eventTypeRepository.delete(eventType);
        } else {
            IllegalArgumentException exception = new IllegalArgumentException("wybrany typ nie istnieje");
            log.error("Typ nie został usunięty!");
            throw exception;
        }
    }
}
