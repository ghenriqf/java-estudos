package repository;
import model.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlunoRepository {
    private final HashMap<Integer,Aluno> alunos = new HashMap<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.put(aluno.getId(), aluno);
    }

    public void removerAluno(int id) {
        alunos.remove(id);
    }

    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos.values());
    }

    public Aluno buscarPorId(int id) {
        return alunos.get(id);
    }
}