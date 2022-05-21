package com.ticketsOnline.services;

import com.ticketsOnline.entities.User;
import com.ticketsOnline.repositories.EventRepository;
import com.ticketsOnline.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private UserRepository userRepository;
    private EventRepository eventRepository;


    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Integer id) {
        return userRepository.getById(id);
    }

    public void delete (User user) {
        if(user.getId() != null) {
            userRepository.delete(user);
        }
    }

    public  void update (User user) {
        if(user.getId() != null) {
            User updatedUser = userRepository.getById(user.getId());
            updatedUser.setFirstName(user.getFirstName());
            updatedUser.setLastName(user.getLastName());
            updatedUser.setMail(user.getMail());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setStreet(user.getStreet());
            updatedUser.setCity(user.getCity());
            updatedUser.setEvent(user.getEvent());
        }
    }

    public void create(User user) {
        if (user.getId() != null) {
            IllegalArgumentException exception = new IllegalArgumentException(
                    "Dodawany użytkownik nie powinien mieć istniejącego ID");
            log.error("Użytkownik nie został zapisany", exception);
            throw exception;
        }
        userRepository.save(user);
    }


}
