package org.aibles.agilepmtool.project.services.iml;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.repositories.ProjectRepository;
import org.aibles.agilepmtool.project.services.GetProjectByProjectIDService;
import org.aibles.agilepmtool.util.exceptions.ProjectNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetProjectByProjectIDServiceIml implements GetProjectByProjectIDService {

    private final ProjectRepository projectRepository;

    @Override
    public Project execute(String projectID) {
        return projectRepository.findByProjectIdentifier(projectID.toUpperCase())
                .orElseThrow(() -> {throw new ProjectNotFoundException(projectID);});
    }
}
