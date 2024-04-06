package com.kshitizsaini113.tickets.events.bean;

import java.math.BigDecimal;

public record Product(
        int id,
        int eventId,
        String name,
        String description,
        BigDecimal price
) {
}
