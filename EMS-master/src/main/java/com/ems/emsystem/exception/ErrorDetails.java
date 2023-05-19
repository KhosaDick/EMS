package com.ems.emsystem.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timestamp;
    private String error;
    private String message;

    public ErrorDetails(LocalDateTime timestamp, String error, String message) {
        this.timestamp = timestamp;
        this.error = error;
        this.message = message;
    }

    // Getters and setters for timestamp, error, and message

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
