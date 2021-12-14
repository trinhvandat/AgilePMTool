package org.aibles.agilepmtool.util.exceptions.handler;

import org.aibles.agilepmtool.util.exceptions.AbstractException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomResponseEntityHandlerException {


    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        Map<String, String> errorMap = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach(e -> errorMap.put(((FieldError) e).getField(), e.getDefaultMessage()));

        return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {AbstractException.class})
    public ResponseEntity<Object> handleAbstractException(AbstractException ex){
        return new ResponseEntity<>(ex.getErrorMessage(), ex.getErrorStatus());
    }
}
