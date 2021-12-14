package org.aibles.agilepmtool.project.services.iml;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.repositories.ProjectRepository;
import org.aibles.agilepmtool.project.services.ListProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListProjectServiceIml implements ListProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public List<Project> execute() {
        return projectRepository.findAll();
    }
}
