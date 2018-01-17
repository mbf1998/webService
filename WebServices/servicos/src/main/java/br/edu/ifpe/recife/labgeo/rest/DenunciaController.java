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

import br.edu.ifpe.recife.labgeo.domain.Denuncia;
import br.edu.ifpe.recife.labgeo.odt.TransicaoDenuncia;
import br.edu.ifpe.recife.labgeo.repository.DenunciaView;
import br.edu.ifpe.recife.labgeo.service.DenunciaService;
import br.edu.ifpe.recife.labgeo.util.Mensagem;

@CrossOrigin
@RestController
@RequestMapping(value = "/denuncia", produces = MediaType.APPLICATION_JSON_VALUE)
public class DenunciaController {
	
	@Autowired
	DenunciaService denunciaService;


	@RequestMapping(method = RequestMethod.GET, value="/listar")
	public List<DenunciaView> buscarTodos(){
		return denunciaService.listarDenuncias();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/buscar/{id}")
	public @ResponseBody Denuncia buscarUm(@PathVariable Integer id) {
		return denunciaService.buscarUm(id);
	}
	
	@RequestMapping(method  = RequestMethod.POST, value = {"/inserir"}, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mensagem inserirDenuncia (@RequestBody Denuncia dadosDenuncia){
		
		//System.out.println("ENTROU NO INSERIR------------------------------------");
		dadosDenuncia.setGdbArchiveOid(0); // aDDED BY ALLAN.. implant WS
		
		return denunciaService.inserir(dadosDenuncia);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/remover/{denunciaId}")
	public Mensagem removerDenuncia(@PathVariable Integer denunciaId){
		return denunciaService.remover(denunciaId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/alterarStatus", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mensagem alterarStatus(@RequestBody TransicaoDenuncia statusDenuncia){
		return denunciaService.alterarStatus(statusDenuncia.getId(), statusDenuncia.getNovoStatus());
	}

}
