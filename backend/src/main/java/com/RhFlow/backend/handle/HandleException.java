package com.RhFlow.backend.handle;

import com.RhFlow.backend.validates.ObjectsValidator;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.hibernate.validator.internal.engine.ConstraintViolationImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Set;

@ControllerAdvice
public class HandleException {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleEntityNotFoundException(EntityNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException e) {
        List<String> errors = e.getConstraintViolations().stream()
                .map(ConstraintViolation::getMessage)
                .toList();


        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }
}
