package com.example.hw5_collections.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "EmployeeAlreadyAdded")
public class EmployeeAlreadyAddedException extends RuntimeException{

        public EmployeeAlreadyAddedException(String message) {
        super(message);
    }
}
