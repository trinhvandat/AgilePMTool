package org.aibles.agilepmtool.project.services.iml;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.repositories.ProjectRepository;
import org.aibles.agilepmtool.project.services.CreateProjectService;
import org.aibles.agilepmtool.util.exceptions.ProjectIdAlreadyExistsException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@RequiredArgsConstructor
public class CreateProjectServiceIml implements CreateProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public Project execute(final Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch (Exception ex){
            throw new ProjectIdAlreadyExistsException(project.getProjectIdentifier());
        }
    }
}
