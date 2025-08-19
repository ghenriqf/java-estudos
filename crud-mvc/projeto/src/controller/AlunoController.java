package controller;

import model.Aluno;
import repository.AlunoRepository;

import java.util.ArrayList;

public class AlunoController {

    private AlunoRepository alunoRepository = new AlunoRepository();

    public void adicionarAluno(String nome, int idade) {
            if (nome.length() < 10) {
                throw new RuntimeException("Nome deve ter no mínimo 10 caracteres.");
            }
            else if (idade < 4 || idade > 20) {
                throw new RuntimeException("Idade inválida.");
            }
            else {
                Aluno aluno = new Aluno(nome,idade);
                alunoRepository.adicionarAluno(aluno);
            }
    }

    public ArrayList<Aluno> listarAlunos() {
        if (alunoRepository.listarAlunos().isEmpty()) {
            throw new RuntimeException("Não tem nenhum aluno na lista.");
        }
        else {
            return alunoRepository.listarAlunos();
        }
    }

    public Aluno buscarPorId(Integer id) {
        if (id < 0 || id > 100) {
            throw new RuntimeException("Id ínvalido, verifique o id correto pela lista de alunos. ");
        }
        else if (alunoRepository.listarAlunos().isEmpty()) {
            throw new RuntimeException("Não tem nenhum aluno na lista.");
        }
        else {
            return alunoRepository.buscarPorId(id);
        }
    }

    public void removerAluno(Integer id) {
        if (id < 0 || id > 100) {
            throw new RuntimeException("Id ínvalido, verifique o id correto pela lista de alunos. ");
        }
        else if (alunoRepository.listarAlunos().isEmpty()) {
            throw new RuntimeException("Não tem nenhum aluno na lista.");
        }
        else {
            alunoRepository.removerAluno(id);
        }
    }
}