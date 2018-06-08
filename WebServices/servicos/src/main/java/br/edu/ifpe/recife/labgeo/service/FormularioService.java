package br.edu.ifpe.recife.labgeo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpe.recife.labgeo.domain.Formulario;
import br.edu.ifpe.recife.labgeo.domain.Manancial;
import br.edu.ifpe.recife.labgeo.domain.TipoManancial;
import br.edu.ifpe.recife.labgeo.repository.FormularioRepository;
import br.edu.ifpe.recife.labgeo.repository.FormularioView;
import br.edu.ifpe.recife.labgeo.repository.TipoManancialRepository;
import br.edu.ifpe.recife.labgeo.util.Mensagem;

@Service
public class FormularioService {
	private final Integer AGUA_SUBTERRANEA_ID = 4;
	
	@Autowired
	private FormularioRepository formularioRepository;

	@Autowired
	private TipoManancialRepository tipoManancialRepository;

	public List<FormularioView> carregarTodos() {
		return formularioRepository.findAllByOrderByIdFormAsc();
	}

	public Formulario buscarUm(String id) {
		return formularioRepository.findOne(id);
	}

	private TipoManancial buscarTipoManancial(Integer idTipo) {
		return tipoManancialRepository.findOne(idTipo);
	}
	
	public Mensagem inserirFormulario(Formulario dadosFormulario){
		System.out.println(dadosFormulario.getDataHora());
	    System.out.println(dadosFormulario.getNomeEntrevistado());
		dadosFormulario.setMananciais(validarManancial(dadosFormulario.getMananciais()));
		
		for (int i = 0; i < dadosFormulario.getMananciais().size(); i++) {
			// Pega o tipo de manancial, procura o tipo do manancial no banco e
			// atribui ao manancial
			Integer idTipo = dadosFormulario.getMananciais().get(i).getTipoManancial().getIdTipoManancial();
			TipoManancial tipoManancial = buscarTipoManancial(idTipo);

			dadosFormulario.getMananciais().get(i).setTipoManancial(tipoManancial);
			
			// Pega o manancial atual
			Manancial manancial = dadosFormulario.getMananciais().get(i);

			//O único manancial que tem agua subterranea é o tipo 4 (águas subterrâneas)
			if(idTipo == AGUA_SUBTERRANEA_ID){
				dadosFormulario.getMananciais().get(i).getAguaSubterranea().setFormulario(dadosFormulario);
				
				//Percorrer a lista de captaçoes de mananciais (Para cada manancial)
				for(int j = 0; j < dadosFormulario.getMananciais().get(i).getCaptacoes().size(); j++){
					// Atribui o manancial a sua captação
					dadosFormulario.getMananciais().get(i).getCaptacoes().get(j).setManancial(manancial);
					
					// Atribui formulario a captação
					dadosFormulario.getMananciais().get(i).getCaptacoes().get(j).setFormulario(dadosFormulario);
				}
			}
			
			// Atribui o manancial ao seu detalhamento manancial
			dadosFormulario.getMananciais().get(i).getDetalhamentoManancial().setManancial(manancial);

			// Atribui o formulario ao manancial
			dadosFormulario.getMananciais().get(i).setFormulario(dadosFormulario);

			// Atribui o formulario a Detalhamento Manancial
			dadosFormulario.getMananciais().get(i).getDetalhamentoManancial().setFormulario(dadosFormulario);
		}

		formularioRepository.save(dadosFormulario);
		
		return new Mensagem("sucesso");
	}
	
	public List<Manancial> validarManancial (List<Manancial> listaMananciais) {
		
		List<Manancial> novaLista = new ArrayList<Manancial>();
		
		for(int i = 0; i < listaMananciais.size(); i++) {
			
			if(listaMananciais.get(i).getTipoManancial().getIdTipoManancial() != null) {
				novaLista.add(listaMananciais.get(i));
			}
		}
		
		return novaLista;
	}
	
}