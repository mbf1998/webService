package br.edu.ifpe.recife.labgeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifpe.recife.labgeo.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	// Authenticate user
	Usuario findByEmailAndSenha(String email, String senha);

	// Find user (use it to edit an user)
	Usuario findByUsuarioId(Integer usuarioId);

	//Changes the user's status based on his id
	@Modifying
	@Query("update Usuario u set u.status = ?1 where u.usuarioId = ?2")
	int setStatusByUsuarioId(String status, Integer usuarioId);
	
	//Update the user based on his id
	@Modifying
	@Transactional
	@Query("update Usuario u set u.nome = ?1, u.email = ?2, u.sobrenome = ?3, u.login = ?4 , u.senha = ?5, u.status = ?6, u.tipo = ?7 where u.usuarioId = ?8")
	void updateByUsuarioId(String nome, String email, String sobrenome, String login, String senha, Boolean status, String tipo, Integer usuarioId);

}
