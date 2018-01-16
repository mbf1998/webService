package br.edu.ifpe.recife.labgeo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import br.edu.ifpe.recife.labgeo.domain.Usuario;
import br.edu.ifpe.recife.labgeo.repository.UsuarioRepository;
import br.edu.ifpe.recife.labgeo.util.Mensagem;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	public Mensagem inserir(Usuario usuario, BindingResult resultado){
		usuario.setEmail(usuario.getEmail().toLowerCase());
		
		usuarioRepository.save(usuario);
		
		if(resultado.hasErrors()){
			return new Mensagem(resultado.getFieldError().getDefaultMessage());
		}

		return new Mensagem("sucesso");
	}
	
	public Mensagem alterarStatus(Integer id){
		Usuario usuarioEncontrado = usuarioRepository.findOne(id);
		usuarioEncontrado.alterarStatus();

		usuarioRepository.save(usuarioEncontrado);

		return new Mensagem("sucesso");
	}
	
	public Mensagem alterarTipo(Integer id){
		Usuario usuarioEncontrado = usuarioRepository.findOne(id);
		usuarioEncontrado.alterarTipo();

		usuarioRepository.save(usuarioEncontrado);

		return new Mensagem("sucesso");
	}
	
	public Mensagem remover(Integer id){
		usuarioRepository.delete(id);

		return new Mensagem("sucesso");
	}
	
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public Usuario buscarUm(Integer id){
		return usuarioRepository.findOne(id);
	}
	
	public Mensagem autenticarUsuario(Usuario usuario){
		String senha = usuario.getSenha();

		Usuario usuarioEncontrado = null;
		usuarioEncontrado = usuarioRepository.findByEmailAndSenha(usuario.getEmail().toLowerCase(), senha);

		if (usuarioEncontrado != null) {
			return new Mensagem("sucesso");
		}

		return new Mensagem("falha");
	}
}
