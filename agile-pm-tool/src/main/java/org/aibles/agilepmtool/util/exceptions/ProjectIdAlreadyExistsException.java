package org.aibles.agilepmtool.util.exceptions;

import org.aibles.agilepmtool.util.exceptions.custom.response.ProjectIdentifierCustomResponse;
import org.springframework.http.HttpStatus;

public class ProjectIdAlreadyExistsException extends AbstractException {
    public ProjectIdAlreadyExistsException(String projectIdentifier) {
        super(HttpStatus.BAD_REQUEST, new ProjectIdentifierCustomResponse("Project ID '" + projectIdentifier.toUpperCase() + "' already exists."));
    }
}
