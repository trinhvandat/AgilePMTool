package org.aibles.agilepmtool.util.exceptions;

import org.aibles.agilepmtool.util.exceptions.custom.response.ProjectIdentifierCustomResponse;
import org.springframework.http.HttpStatus;

public class ProjectNotFoundException extends AbstractException {
    public ProjectNotFoundException(String projectID) {
        super(HttpStatus.NOT_FOUND, new ProjectIdentifierCustomResponse("Project ID '" + projectID.toUpperCase() + "' does not exists."));
    }
}
