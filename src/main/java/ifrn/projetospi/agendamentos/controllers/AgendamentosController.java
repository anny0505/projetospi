package ifrn.projetospi.agendamentos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgendamentosController {
	
	@RequestMapping("/")
	public String agendamento() {
		return "agendamento";
	}

}
