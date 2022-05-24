package com.ticketsOnline.repositories;

import com.ticketsOnline.entities.EventType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventTypeRepository extends JpaRepository<EventType, Integer> {
}
