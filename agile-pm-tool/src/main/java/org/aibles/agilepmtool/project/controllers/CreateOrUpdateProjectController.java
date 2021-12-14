package org.aibles.agilepmtool.project.controllers;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.services.CreateOrUpdateProjectService;
import org.aibles.agilepmtool.util.RestApiConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.Valid;

@RestControllerAdvice
@RequestMapping("/" + RestApiConstant.API + "/" + RestApiConstant.VERSION + "/" + RestApiConstant.PROJECT_RESOURCE)
@RequiredArgsConstructor
public class CreateOrUpdateProjectController {

    private final CreateOrUpdateProjectService createOrUpdateProjectService;

    @PutMapping
    public ResponseEntity<Project> createOrUpdateProject(@Valid @RequestBody Project project){
        return new ResponseEntity<>(createOrUpdateProjectService.execute(project), HttpStatus.OK);
    }
}
