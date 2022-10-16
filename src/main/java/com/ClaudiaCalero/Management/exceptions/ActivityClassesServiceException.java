package com.ClaudiaCalero.Management.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ActivityClassesServiceException extends RuntimeException {
    public ActivityClassesServiceException(String message) {
        super(message);
    }
}
