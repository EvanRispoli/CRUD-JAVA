package infnet.edu.br.Cadastro.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import infnet.edu.br.Cadastro.model.domain.Receita;
import infnet.edu.br.Cadastro.model.service.ReceitaService;

@Controller
public class ReceitaController {

	@Autowired
	private ReceitaService receitaService;

	@GetMapping(value = "/receita")
	public String telaCadastro() {
		return "receita/cadastro";
	}

	@GetMapping(value = "/receitas")
	public String telaLista(Model model) {

		model.addAttribute("listaReceitas", receitaService.obterLista());

		return "receita/lista";
	}

	@PostMapping(value = "/receita/incluir")
	public String incluir(Model model, Receita receita) {
		
		receitaService.incluir(receita);

		model.addAttribute("nome", receita.getNome());
		// return "redirect:/receitas";
		return telaLista(model);
	}

	@GetMapping(value = "/receita/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		receitaService.excluir(id);

		return "redirect:/receitas";

	}

}
