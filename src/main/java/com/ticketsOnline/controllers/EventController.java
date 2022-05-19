package com.ticketsOnline.controllers;

import com.ticketsOnline.entities.Event;
import com.ticketsOnline.services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@AllArgsConstructor
public class EventController {

    private EventService eventService;

    @GetMapping("/events")
    public String getAllEvents(ModelMap modelMap){
        List<Event> events = eventService.getAll();
        modelMap.addAttribute("events", events);
        return "/events";

    }

    @GetMapping("/add-event")
    public String getForm(@ModelAttribute("event") Event event){
        eventService.addEvent(event);
        return "/add-event";
    }
//    @GetMapping("/add-event")
//    public String getUpdateForm(Event event){
//        eventService.addEvent(event);
//        return "redirect:/add-event";
//    }







}
