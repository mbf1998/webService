package br.edu.ifpe.recife.labgeo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpe.recife.labgeo.domain.Formulario;

public interface FormularioRepository extends JpaRepository<Formulario, String> {
	
	FormularioView findByIdForm(String idForm);
	
	List<FormularioView> findAllByOrderByIdFormAsc();

}
