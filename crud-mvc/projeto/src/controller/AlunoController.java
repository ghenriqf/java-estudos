package controller;

import model.Aluno;
import repository.AlunoRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlunoController {

    private final AlunoRepository alunoRepository = new AlunoRepository();

    public void adicionarAluno(String nome, int idade) {
        if (nome.length() < 10) {
            throw new RuntimeException("Nome deve ter no mínimo 10 caracteres.");
        }
        else if (idade < 4 || idade > 20) {
            throw new RuntimeException("Idade inválida.");
        }
        Aluno aluno = new Aluno(nome,idade);
        alunoRepository.adicionarAluno(aluno);
    }

    public List<Aluno> listarAlunos() {
        List<Aluno> alunos = alunoRepository.listarAlunos();
        if (alunos.isEmpty()) {
            throw new RuntimeException("Não tem nenhum aluno na lista.");
        }
        return alunos;
    }

    public Aluno buscarPorId(Integer id) {
        Aluno aluno = alunoRepository.buscarPorId(id);
        if (aluno == null) {
            throw new RuntimeException("Não tem nenhum aluno com esse id na lista.");
        }
        return aluno;
    }

    public void removerAluno(Integer id) {
        Aluno aluno = alunoRepository.buscarPorId(id);
        if (aluno == null) {
            throw new RuntimeException("Não tem nenhum aluno com esse id na lista.");
        }
        alunoRepository.removerAluno(id);
    }
}