package com.ticketsOnline.repositories;

import com.ticketsOnline.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
