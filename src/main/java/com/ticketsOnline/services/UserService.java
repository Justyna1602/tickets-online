package com.ticketsOnline.services;

import com.ticketsOnline.entities.User;
import com.ticketsOnline.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;


    public List<User> getAll() {
        return userRepository.findAll();
    }


}
