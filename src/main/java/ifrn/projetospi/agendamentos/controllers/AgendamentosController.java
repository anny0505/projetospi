package ifrn.projetospi.agendamentos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.projetospi.agendamentos.models.Agendamento;
import ifrn.projetospi.agendamentos.repositories.AgendamentoRepository;

@Controller
public class AgendamentosController {
	
	@Autowired
	private AgendamentoRepository ar;
	
	@RequestMapping("/")
	public String agendamento() {
		return "agendamento";
	}
	
	@PostMapping("/agendamentos")
	public String adicionarAgendamento(Agendamento agendamento) {
		System.out.println(agendamento);
		ar.save(agendamento);
		return "agendamentoConcluido";
	}

}
