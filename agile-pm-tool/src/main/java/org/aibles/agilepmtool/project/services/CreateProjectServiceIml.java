package org.aibles.agilepmtool.project.services;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateProjectServiceIml implements CreateProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public Project execute(final Project project) {
        project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
        return projectRepository.save(project);
    }
}
