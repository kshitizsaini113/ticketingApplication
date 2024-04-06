package com.kshitizsaini113.tickets.events.repository;

import com.kshitizsaini113.tickets.events.bean.Organizer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers = List.of(
            new Organizer(101, "Globomantics", "Globomantics Technology Corporation"),
            new Organizer(102, "Carved Rock", "Carved Rock Sport Equipment")
    );

    public List<Organizer> findAll() {
        return organizers;
    }
}
