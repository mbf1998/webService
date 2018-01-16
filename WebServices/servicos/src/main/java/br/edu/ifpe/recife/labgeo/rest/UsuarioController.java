package br.edu.ifpe.recife.labgeo.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpe.recife.labgeo.domain.Usuario;
import br.edu.ifpe.recife.labgeo.service.UsuarioService;
import br.edu.ifpe.recife.labgeo.util.Mensagem;

@CrossOrigin
@RestController
@RequestMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(value = "/inserir", method = RequestMethod.POST)
	public Mensagem inserirUsuario(@RequestBody @Valid Usuario dadosUsuario, BindingResult resultado) {

		return usuarioService.inserir(dadosUsuario, resultado);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/alterarStatus/{id}")
	public Mensagem alterarStatus(@PathVariable Integer id) {

		return usuarioService.alterarStatus(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/alterarTipo/{id}")
	public Mensagem alterarTipo(@PathVariable Integer id) {

		return usuarioService.alterarTipo(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/remover/{usuarioId}")
	public Mensagem remover(@PathVariable Integer usuarioId) {
		return usuarioService.remover(usuarioId);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Usuario> getAll() {
		return usuarioService.listarUsuarios();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/buscar/{id}")
	public Usuario get(@PathVariable Integer id) {
		return usuarioService.buscarUm(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/autenticar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mensagem autenticar(@RequestBody Usuario dadosUsuario) {
		return usuarioService.autenticarUsuario(dadosUsuario);
	}

}
