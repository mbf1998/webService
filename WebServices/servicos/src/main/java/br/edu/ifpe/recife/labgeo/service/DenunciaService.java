package br.edu.ifpe.recife.labgeo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.ifpe.recife.labgeo.domain.Denuncia;
import br.edu.ifpe.recife.labgeo.repository.DenunciaRepository;
import br.edu.ifpe.recife.labgeo.repository.DenunciaView;
import br.edu.ifpe.recife.labgeo.util.Mensagem;

@Service
public class DenunciaService {

	@Autowired
	DenunciaRepository denunciaRepository;
	
	private final Integer MIN_STATUS_INVALIDO = 0; 
	private final Integer MAX_STATUS_INVALIDO = 7; 

	public List<DenunciaView> listarDenuncias(){
		return denunciaRepository.findAllByOrderByGdbArchiveOid();
	}
	
	public @ResponseBody Denuncia buscarUm(@PathVariable Integer id) {
		return denunciaRepository.findOne(id);
	}
	
	public Mensagem inserir(@RequestBody Denuncia dadosDenuncia){
		//System.out.println("ENTROU NO INSERIR SERVICE ------------------------------------");
		denunciaRepository.save(dadosDenuncia);
		
		return new Mensagem("sucesso! Você poderá acompanhar a sua denúncia por este ID: " + dadosDenuncia.getGdbArchiveOid());
	}
	
	public Mensagem remover(@PathVariable Integer denunciaId){
		denunciaRepository.delete(denunciaId);
		
		return new Mensagem("sucesso");
	}
	
	public Mensagem alterarStatus(Integer idDenuncia, Integer novoStatus){
		
		if(novoStatus < MIN_STATUS_INVALIDO || novoStatus > MAX_STATUS_INVALIDO){
			return new Mensagem("invalido");
		}
		
		Denuncia denuncia = denunciaRepository.findOne(idDenuncia);
		denuncia.setStatus(novoStatus);
		
		denunciaRepository.save(denuncia);
		
		return new Mensagem("sucesso");
	}
}
