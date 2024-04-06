package com.kshitizsaini113.tickets.events.controller;

import com.kshitizsaini113.tickets.events.bean.Event;
import com.kshitizsaini113.tickets.events.bean.Organizer;
import com.kshitizsaini113.tickets.events.bean.Product;
import com.kshitizsaini113.tickets.events.repository.EventRepository;
import com.kshitizsaini113.tickets.events.repository.OrganizerRepository;
import com.kshitizsaini113.tickets.events.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class EventController {

    private final OrganizerRepository organizerRepository;
    private final EventRepository eventRepository;
    private final ProductRepository productRepository;


    public EventController(OrganizerRepository organizerRepository, EventRepository eventRepository, ProductRepository productRepository) {
        this.organizerRepository = organizerRepository;
        this.eventRepository = eventRepository;
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/organizers")
    public List<Organizer> getOrganizers() {
        return organizerRepository.findAll();
    }

    @GetMapping(path = "/events")
    public List<Event> getEventByOrganizer(@RequestParam("organizerId") int organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }

    @GetMapping(path = "/events/{id}")
    public Event getEventById(@PathVariable("id") int eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(
                        () -> new NoSuchElementException("Event with id " + eventId + " not found")
                );
    }

    @GetMapping(path = "/products")
    public List<Product> getProductByEvent(@RequestParam("eventId") int eventId) {
        return productRepository.findByEventId(eventId);
    }
}
