package view;


import model.Aluno;
import repository.AlunoRepository;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno(1,"Gabriel",18);
        Aluno b = new Aluno(2,"Henrique",19);
        Aluno c = new Aluno(3,"Freitas",20);

        AlunoRepository alunos = new AlunoRepository();
        alunos.adicionarAluno(a);
        alunos.adicionarAluno(b);
        alunos.adicionarAluno(c);

        System.out.println(alunos.buscarPorId(1));
        System.out.println(alunos.buscarPorId(2));
    }

}