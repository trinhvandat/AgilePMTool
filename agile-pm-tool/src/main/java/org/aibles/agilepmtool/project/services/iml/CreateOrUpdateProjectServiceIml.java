package org.aibles.agilepmtool.project.services.iml;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.repositories.ProjectRepository;
import org.aibles.agilepmtool.project.services.CreateOrUpdateProjectService;
import org.aibles.agilepmtool.util.exceptions.handler.ProjectIdIsNullException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CreateOrUpdateProjectServiceIml implements CreateOrUpdateProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public Project execute(Project project) {

        if (Objects.isNull(project.getId())){
            throw new ProjectIdIsNullException();
        }

        project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
        return projectRepository.save(project);
    }
}
