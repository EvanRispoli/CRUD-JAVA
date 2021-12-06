package infnet.edu.br.Cadastro.model.controller;

import infnet.edu.br.Cadastro.model.domain.Despesa;
import infnet.edu.br.Cadastro.model.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DespesaController {

	@Autowired
	private DespesaService despesaService;

	@GetMapping(value = "/despesa")
	public String telaCadastro() {
		return "despesa/cadastro";
	}

	@GetMapping(value = "/despesas")
	public String telaLista(Model model) {

		model.addAttribute("listaDespesas", despesaService.obterLista());

		return "despesa/lista";
	}

	@PostMapping(value = "/despesa/incluir")
	public String incluir(Model model, Despesa despesa) {
		
		despesaService.incluir(despesa);

		model.addAttribute("nome", despesa.getNome());
		// return "redirect:/despesas";
		return telaLista(model);
	}

	@GetMapping(value = "/despesa/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		despesaService.excluir(id);

		return "redirect:/despesas";

	}

}
