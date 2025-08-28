package com.ghenriqf.spring_estudos.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // Essa classe vai ouvir/examinar todas as exceções lançadas nos meus controllers e decidir como lidar com elas.
public class GlobalExceptionHandler {

    @ExceptionHandler(AlunoNotFoundException.class) // define qual exceção específica esse método vai capturar.
    public ResponseEntity<String> handleAlunoNotFound(AlunoNotFoundException ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
        // ResponseEntity permite controlar Status HTTP Corpo da resposta passado pela exceção
    }
}
