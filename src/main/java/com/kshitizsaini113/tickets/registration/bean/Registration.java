package com.kshitizsaini113.tickets.registration.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("registrations")
public record Registration(
        @Id String id,
        @NotNull(message = "Product ID is required") Integer productId,
        String ticketCode,
        @NotBlank(message = "Attendee Name is required") String attendeeName
) {
}
