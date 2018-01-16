package br.edu.ifpe.recife.labgeo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpe.recife.labgeo.domain.Denuncia;

public interface DenunciaRepository extends JpaRepository<Denuncia, Integer> {
	List<DenunciaView> findAllByOrderByGdbArchiveOid();
}
