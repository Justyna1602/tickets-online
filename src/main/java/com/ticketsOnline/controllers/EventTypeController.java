package com.ticketsOnline.controllers;

import com.ticketsOnline.entities.EventType;
import com.ticketsOnline.services.EventTypeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
@AllArgsConstructor
public class EventTypeController {
    private EventTypeService eventTypeService;

    @GetMapping("/eventTypes-list")
    public String getAllEventTypes(ModelMap modelMap){
        List<EventType> elementTypes = eventTypeService.getAll();
        modelMap.addAttribute("eventTypes", elementTypes);
        return "/eventType-list";
    }
}
