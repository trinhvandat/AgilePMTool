package org.aibles.agilepmtool.util.exceptions;

import org.springframework.http.HttpStatus;

public class AbstractException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final HttpStatus errorStatus;
    private final Object errorMessage;

    public AbstractException(HttpStatus errorStatus, Object errorMessage) {
        super(errorMessage.toString());
        this.errorStatus = errorStatus;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getErrorStatus() {
        return errorStatus;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }
}
