package com.ghenriqf.spring_estudos.exception;

public class AlunoNotFoundException extends RuntimeException {

    public AlunoNotFoundException(Long id) {
        super("Aluno com ID " + id + " não encontrado");
    }
}
