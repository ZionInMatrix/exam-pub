package com.example.exampub.services.exceptions;

public class ValidationServiceException extends RuntimeException {
    public ValidationServiceException(String message) {
        super(message);
    }
}
