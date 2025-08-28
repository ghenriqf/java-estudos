package com.ghenriqf.spring_estudos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // Essa classe vai ouvir/examinar todas as exceções lançadas nos meus controllers e decidir como lidar com elas.
public class GlobalExceptionHandler {

    @ExceptionHandler(AlunoNotFoundException.class) // define qual exceção específica esse método vai capturar.
    public ResponseEntity<ErrorResponse> handleAlunoNotFound(AlunoNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        // ResponseEntity permite controlar Status HTTP Corpo da resposta passado pela exceção
    }
}
