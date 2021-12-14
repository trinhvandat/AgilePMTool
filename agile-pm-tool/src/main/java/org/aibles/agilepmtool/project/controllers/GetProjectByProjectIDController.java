package org.aibles.agilepmtool.project.controllers;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.services.GetProjectByProjectIDService;
import org.aibles.agilepmtool.util.RestApiConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/" + RestApiConstant.API + "/" + RestApiConstant.VERSION + "/" + RestApiConstant.PROJECT_RESOURCE)
@RequiredArgsConstructor
public class GetProjectByProjectIDController {

    private final GetProjectByProjectIDService getProjectByProjectIDService;

    @GetMapping("/{projectID}")
    public ResponseEntity<Project> getProject(@PathVariable("projectID") final String projectID){
        return new ResponseEntity<>(getProjectByProjectIDService.execute(projectID), HttpStatus.OK);
    }
}
