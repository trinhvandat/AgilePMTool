package org.aibles.agilepmtool.project.services;

import org.aibles.agilepmtool.project.domain.Project;

public interface GetProjectByProjectIDService {

    Project execute(String projectID);
}
