package infnet.edu.br.Cadastro.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import infnet.edu.br.Cadastro.model.domain.Pessoa;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.PessoaService;

@Controller
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping(value = "/pessoa")
	public String telaCadastro() {
		return "pessoa/cadastro";
	}

	@GetMapping(value = "/pessoas")
	public String telaLista(Model model,  @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaPessoas", pessoaService.obterLista(usuario));

		return "pessoa/lista";
	}

	@PostMapping(value = "/pessoa/incluir")
	public String incluir(Model model, Pessoa pessoa, @SessionAttribute("user") Usuario usuario) {
		
		pessoa.setUsuario(usuario);

		pessoaService.incluir(pessoa);

		model.addAttribute("nome", pessoa.getNome());
		// return "redirect:/pessoas";
		return telaLista(model, usuario);
	}

	@GetMapping(value = "/pessoa/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		pessoaService.excluir(id);

		return "redirect:/pessoas";
	}

}
