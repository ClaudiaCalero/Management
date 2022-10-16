package com.ClaudiaCalero.Management.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BookingNullException extends RuntimeException {
    public BookingNullException(String message) {
        super(message);
    }
}
