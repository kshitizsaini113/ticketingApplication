package com.kshitizsaini113.tickets.events.bean;

public record Venue(
        int id,
        String name,
        String street,
        String city,
        String country
) {
}
