package com.ghenriqf.spring_estudos.repository;

import com.ghenriqf.spring_estudos.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

// O Spring Data JPA já implementa os métodos automaticamente
public interface AlunoRepository extends JpaRepository<Aluno,Long> {
    // METODOS
    //save(Aluno aluno)	Insere um novo aluno ou atualiza se o ID já existir
    //findById(Long id)	Busca um aluno pelo ID, retorna Optional<Aluno>
    //findAll()	Retorna uma lista com todos os alunos
    //deleteById(Long id)	Deleta um aluno pelo ID
    //delete(Aluno aluno)	Deleta o aluno passado como objeto
    //count()	Retorna o número de registros na tabela
    //existsById(Long id)	Verifica se existe um aluno com aquele ID
}
