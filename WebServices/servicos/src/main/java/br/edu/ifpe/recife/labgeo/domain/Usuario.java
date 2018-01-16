package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import br.edu.ifpe.recife.labgeo.util.SenhaUtil;

/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name = "usuarios")
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private Integer usuarioId;

	private String email;

	private String login;

	private String nome;

	@JsonProperty (access = Access.WRITE_ONLY)
	private String senha;

	private String sobrenome;

	private Boolean status;

	private String tipo;

	public Usuario() {
	}

	public Integer getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = SenhaUtil.criptografarSenha(senha, senha, "MD5");
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void alterarStatus() {
		if (this.status == false) {
			this.status = true;
		} else {
			this.status = false;
		}
	}

	public String getTipo() {
		return this.tipo;
	}

	public void alterarTipo() {
		String admin = "ADMIN";
		String comum = "COMUM";

		if (this.tipo.equals(admin)) {
			this.tipo = comum;
		} else {
			this.tipo = admin;
		}
	}

}