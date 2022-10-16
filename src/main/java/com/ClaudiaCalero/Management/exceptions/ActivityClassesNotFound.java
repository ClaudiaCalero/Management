package com.ClaudiaCalero.Management.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ActivityClassesNotFound extends RuntimeException {
    public ActivityClassesNotFound(String message) {
        super(message);
    }

}