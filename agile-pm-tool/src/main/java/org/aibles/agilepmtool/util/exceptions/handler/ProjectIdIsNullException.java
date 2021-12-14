package org.aibles.agilepmtool.util.exceptions.handler;

import org.aibles.agilepmtool.util.exceptions.AbstractException;
import org.aibles.agilepmtool.util.exceptions.custom.response.ProjectIdCustomResponse;
import org.springframework.http.HttpStatus;

public class ProjectIdIsNullException extends AbstractException {
    public ProjectIdIsNullException() {
        super(HttpStatus.BAD_REQUEST, new ProjectIdCustomResponse("Project id is required."));
    }
}
