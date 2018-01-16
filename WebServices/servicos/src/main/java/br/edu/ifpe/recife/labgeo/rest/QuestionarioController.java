package br.edu.ifpe.recife.labgeo.rest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpe.recife.labgeo.domain.Questionario;
import br.edu.ifpe.recife.labgeo.repository.QuestionarioRepository;
import br.edu.ifpe.recife.labgeo.util.Mensagem;

@CrossOrigin
@RestController
@RequestMapping(value = "/questionario", produces = MediaType.APPLICATION_JSON_VALUE)
public class QuestionarioController {
	@Autowired
	QuestionarioRepository questionarioRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Questionario> get() {
		return questionarioRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value=  "/{id}")
	public Questionario getOne(@PathVariable Integer id) {
		return questionarioRepository.findOne(id);
	}
	
	// Para salvar e atualizar
	@RequestMapping(method = RequestMethod.POST)
	public Mensagem save(@RequestBody Questionario questionario) {
		
		// mudando o status para concluido_sincronizado
		questionario.setStatusQuestionario("concluido_sincronizado"); 
		
		// colocando o timestamp atual para armazenar a data/hora da sinconização
		Date date = new Date();
        questionario.setDataHoraSincronizacao(new Timestamp(date.getTime()));
		
		questionarioRepository.save(questionario);
		return new Mensagem("OK;" + questionario.getNumeroFormulario());
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public Mensagem delete(@PathVariable Integer id) {
		questionarioRepository.delete(id);
		return new Mensagem("OK"); 
	}
	
}
