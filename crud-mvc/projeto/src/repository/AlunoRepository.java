package repository;
import model.Aluno;

import java.util.ArrayList;
import java.util.HashMap;

public class AlunoRepository {
    private HashMap<Integer,Aluno> alunos = new HashMap<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.put(aluno.getId(), aluno);
    }

    public ArrayList listarAlunos() {
        ArrayList<Aluno> alunosLista = new ArrayList<>(alunos.values());
        return  alunosLista;
    }

    public Aluno buscarPorId(Integer id) {
        return alunos.get(id);
    }
}