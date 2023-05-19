package com.ems.emsystem.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ErrorDetails> handleGlobalException(Exception ex) {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), "Internal Server Error", ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseBody
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), "Resource Not Found", ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidRequestException.class)
    @ResponseBody
    public ResponseEntity<ErrorDetails> handleInvalidRequestException(InvalidRequestException ex) {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), "Invalid Request", ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    // Add more exception handlers as needed

    // ErrorDetails class
    private static class ErrorDetails {
        private final LocalDateTime timestamp;
        private final String error;
        private final String message;

        public ErrorDetails(LocalDateTime timestamp, String error, String message) {
            this.timestamp = timestamp;
            this.error = error;
            this.message = message;
        }

        // Getters for timestamp, error, and message
        // ...
    }
}
