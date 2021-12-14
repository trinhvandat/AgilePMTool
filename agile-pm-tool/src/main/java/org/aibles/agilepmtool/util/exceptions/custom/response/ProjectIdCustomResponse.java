package org.aibles.agilepmtool.util.exceptions.custom.response;

public class ProjectIdCustomResponse {

    private final String projectIdentifier;

    public ProjectIdCustomResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }
}
