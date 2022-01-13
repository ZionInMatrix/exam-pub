package com.example.exampub.config;

import com.example.exampub.rest.models.ErrorBodyRest;
import com.example.exampub.services.exceptions.DrinkMenuServiceException;
import com.example.exampub.services.exceptions.UserServiceException;
import com.example.exampub.services.exceptions.ValidationServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@Component
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler({UserServiceException.class})
    public ResponseEntity<ErrorBodyRest> handleException(UserServiceException ex, WebRequest request) {
        ErrorBodyRest bodyOfResponse = new ErrorBodyRest();
        bodyOfResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        bodyOfResponse.setMessage(ex.getMessage());
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), request);
    }

    private ResponseEntity<ErrorBodyRest> handleExceptionInternal(UserServiceException ex, ErrorBodyRest bodyOfResponse, HttpHeaders httpHeaders, WebRequest request) {
        logger.error(ex);
        return new ResponseEntity<>(bodyOfResponse, httpHeaders, bodyOfResponse.getHttpStatus());
    }

    @ExceptionHandler({DrinkMenuServiceException.class})
    public ResponseEntity<ErrorBodyRest> handleException(DrinkMenuServiceException ex, WebRequest request) {
        ErrorBodyRest bodyOfResponse = new ErrorBodyRest();
        bodyOfResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        bodyOfResponse.setMessage(ex.getMessage());
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), request);
    }

    private ResponseEntity<ErrorBodyRest> handleExceptionInternal(DrinkMenuServiceException ex, ErrorBodyRest bodyOfResponse, HttpHeaders httpHeaders, WebRequest request) {
        logger.error(ex);
        return new ResponseEntity<>(bodyOfResponse, httpHeaders, bodyOfResponse.getHttpStatus());
    }

    @ExceptionHandler({ValidationServiceException.class})
    public ResponseEntity<ErrorBodyRest> handleException(ValidationServiceException ex, WebRequest request) {
        ErrorBodyRest bodyOfResponse = new ErrorBodyRest();
        bodyOfResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        bodyOfResponse.setMessage(ex.getMessage());
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), request);
    }

    private ResponseEntity<ErrorBodyRest> handleExceptionInternal(ValidationServiceException ex, ErrorBodyRest bodyOfResponse, HttpHeaders httpHeaders, WebRequest request) {
        logger.error(ex);
        return new ResponseEntity<>(bodyOfResponse, httpHeaders, bodyOfResponse.getHttpStatus());
    }

}
