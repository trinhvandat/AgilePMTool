package org.aibles.agilepmtool.project.controllers;

import lombok.RequiredArgsConstructor;
import org.aibles.agilepmtool.project.services.DeleteProjectService;
import org.aibles.agilepmtool.util.RestApiConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/" + RestApiConstant.API + "/" + RestApiConstant.VERSION + "/" + RestApiConstant.PROJECT_RESOURCE)
@RequiredArgsConstructor
public class DeleteProjectController {

    private final DeleteProjectService deleteProjectService;

    @DeleteMapping("/{projectId}")
    public ResponseEntity<String> deleteProject(@PathVariable("projectId") final String projectId){
        deleteProjectService.execute(projectId);
        return new ResponseEntity<>("Project with ID: '" + projectId.toUpperCase() + "' was deleted.", HttpStatus.OK);
    }
}
