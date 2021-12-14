package org.aibles.agilepmtool.project.services.iml;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.repositories.ProjectRepository;
import org.aibles.agilepmtool.project.services.DeleteProjectService;
import org.aibles.agilepmtool.util.exceptions.ProjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteProjectServiceIml implements DeleteProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public void execute(String projectID) {
        projectRepository.findByProjectIdentifier(projectID.toUpperCase())
                .map(project -> {
                    projectRepository.delete(project);
                    return project;
                })
                .orElseThrow(() -> {throw new ProjectNotFoundException(projectID);});
    }
}
