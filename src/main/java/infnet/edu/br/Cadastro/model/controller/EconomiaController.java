package infnet.edu.br.Cadastro.model.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import infnet.edu.br.Cadastro.model.domain.Economia;
import infnet.edu.br.Cadastro.model.service.EconomiaService;

@Controller
public class EconomiaController {

	@Autowired
	private EconomiaService economiaService;

	@GetMapping(value = "/economia")
	public String telaCadastro() {
		return "economia/cadastro";
	}

	@GetMapping(value = "/economias")
	public String telaLista(Model model) {

		model.addAttribute("listaEconomias", economiaService.obterLista());

		return "economia/lista";
	}

	@PostMapping(value = "/economia/incluir")
	public String incluir(Model model, Economia economia) {
		
		economiaService.incluir(economia);

		model.addAttribute("nome", economia.getNome());
		// return "redirect:/economias";
		return telaLista(model);
	}

	@GetMapping(value = "/economia/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		economiaService.excluir(id);

		return "economia/lista";

	}

}
