package ifrn.projetospi.agendamentos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.projetospi.agendamentos.models.Agendamento;
import ifrn.projetospi.agendamentos.repositories.AgendamentoRepository;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentosController {

	@Autowired
	private AgendamentoRepository ar;

	@GetMapping("/form")
	public String form() {
		return "agendamentos/agendamento";

	}

	@PostMapping
	public String adicionar(Agendamento agendamento) {
		System.out.println(agendamento);
		ar.save(agendamento);

		return "agendamentos/agendamentoConcluido";
	}
	
	@GetMapping
	public ModelAndView listar() {
		
		List<Agendamento> agendamentos = ar.findAll();
		ModelAndView mv = new ModelAndView("agendamentos/lista");
		mv.addObject("agendamentos", agendamentos);
		return mv;
}
	}