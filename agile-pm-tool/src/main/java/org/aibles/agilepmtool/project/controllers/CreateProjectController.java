package org.aibles.agilepmtool.project.controllers;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.services.CreateProjectService;
import org.aibles.agilepmtool.util.RestApiConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.Valid;

@RestControllerAdvice
@RequestMapping("/" + RestApiConstant.API + "/" + RestApiConstant.VERSION + "/" + RestApiConstant.PROJECT_RESOURCE)
@RequiredArgsConstructor
public class CreateProjectController {

    private final CreateProjectService createProjectService;

    @PostMapping
    public ResponseEntity<Project> createProject(@Valid @RequestBody Project project){
        return new ResponseEntity<>(createProjectService.execute(project), HttpStatus.OK);
    }
}
