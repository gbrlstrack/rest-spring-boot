package com.strack.demo.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final Date timestamp;
    private final String message;
    private final String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.details = details;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getDetails() {
        return details;
    }

    public String getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

}
