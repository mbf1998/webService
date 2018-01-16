package br.edu.ifpe.recife.labgeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpe.recife.labgeo.domain.Questionario;

public interface QuestionarioRepository extends JpaRepository<Questionario, Integer> {
}
