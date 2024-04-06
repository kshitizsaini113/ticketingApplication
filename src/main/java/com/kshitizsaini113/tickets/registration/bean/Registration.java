package com.kshitizsaini113.tickets.registration.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Registration(
        Integer id,
        @NotNull(message = "Product ID is required") Integer productId,
        String ticketCode,
        @NotBlank(message = "Attendee Name is required") String attendeeName
) {
}
