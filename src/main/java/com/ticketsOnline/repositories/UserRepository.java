package com.ticketsOnline.repositories;

import com.ticketsOnline.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {
}
