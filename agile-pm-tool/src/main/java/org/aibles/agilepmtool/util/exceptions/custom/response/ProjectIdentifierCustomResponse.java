package org.aibles.agilepmtool.util.exceptions.custom.response;

public class ProjectIdentifierCustomResponse {

    private final String projectIdentifier;

    public ProjectIdentifierCustomResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }
}
