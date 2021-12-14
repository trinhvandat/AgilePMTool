package org.aibles.agilepmtool.util.exceptions;

import org.aibles.agilepmtool.util.exceptions.custom.response.ProjectIdCustomResponse;
import org.springframework.http.HttpStatus;

public class ProjectNotFoundException extends AbstractException {
    public ProjectNotFoundException(String projectID) {
        super(HttpStatus.NOT_FOUND, new ProjectIdCustomResponse("Project ID '" + projectID.toUpperCase() + "' does not exists."));
    }
}
