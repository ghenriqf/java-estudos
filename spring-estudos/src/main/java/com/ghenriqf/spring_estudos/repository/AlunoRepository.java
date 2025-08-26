package com.ghenriqf.spring_estudos.repository;

import com.ghenriqf.spring_estudos.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {}
