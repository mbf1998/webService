package br.edu.ifpe.recife.labgeo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpe.recife.labgeo.domain.Formulario;
import br.edu.ifpe.recife.labgeo.repository.FormularioView;
import br.edu.ifpe.recife.labgeo.service.FormularioService;
import br.edu.ifpe.recife.labgeo.util.Mensagem;

@CrossOrigin
@RestController
@RequestMapping(value = "/formulario", produces = MediaType.APPLICATION_JSON_VALUE)
public class FormularioController {
	
	@Autowired
	FormularioService formularioService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<FormularioView> buscarTodos() {
		return formularioService.carregarTodos();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public @ResponseBody Formulario buscarUm(@PathVariable String id) {
		return formularioService.buscarUm(id);
	}

	@RequestMapping(value = "/inserir", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mensagem inserirFormulario(@RequestBody Formulario dadosFormulario) {
		return formularioService.inserirFormulario(dadosFormulario);
	}
}
