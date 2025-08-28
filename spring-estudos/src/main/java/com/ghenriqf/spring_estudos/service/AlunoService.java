package com.ghenriqf.spring_estudos.service;

import com.ghenriqf.spring_estudos.domain.Aluno;
import com.ghenriqf.spring_estudos.exception.AlunoNotFoundException;
import com.ghenriqf.spring_estudos.repository.AlunoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno salvar(Aluno aluno) {
        if (aluno.getNome().length() < 3) {
            throw new RuntimeException("Nome muito curto");
        }
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodos() {
        if (alunoRepository.count() == 0) {
            throw new RuntimeException("Nenhum aluno foi cadastrado");
        }
        return alunoRepository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new AlunoNotFoundException(id));
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }

}
