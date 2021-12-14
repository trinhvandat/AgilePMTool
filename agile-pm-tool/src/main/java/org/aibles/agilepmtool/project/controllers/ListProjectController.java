package org.aibles.agilepmtool.project.controllers;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.domain.Project;
import org.aibles.agilepmtool.project.services.ListProjectService;
import org.aibles.agilepmtool.util.RestApiConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@RequestMapping("/" + RestApiConstant.API + "/" + RestApiConstant.VERSION + "/" + RestApiConstant.PROJECT_RESOURCE)
@RequiredArgsConstructor
public class ListProjectController {

    private final ListProjectService listProjectService;

    @GetMapping
    public ResponseEntity<List<Project>> listProjects(){
        return new ResponseEntity<>(listProjectService.execute(), HttpStatus.OK);
    }
}
