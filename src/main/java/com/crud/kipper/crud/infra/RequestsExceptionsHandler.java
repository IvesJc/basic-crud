package com.crud.kipper.crud.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
// sempre que uma excessão for chamada, essa classe será responsável pelo tratamento
public class RequestsExceptionsHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity threat404(){
    ExceptionDTO response = new ExceptionDTO("Dado não encontrado");
        return ResponseEntity.badRequest().body(response);
    }
}
