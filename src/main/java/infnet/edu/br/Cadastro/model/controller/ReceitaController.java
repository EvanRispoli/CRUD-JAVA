package infnet.edu.br.Cadastro.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import infnet.edu.br.Cadastro.model.domain.Receita;
import infnet.edu.br.Cadastro.model.domain.Usuario;
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
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaReceitas", receitaService.obterLista(usuario));
		
		return "receita/lista";
	}

	@PostMapping(value = "/receita/incluir")
	public String incluir(Model model, Receita receita, @SessionAttribute("user") Usuario usuario) {
		
		receita.setUsuario(usuario);
		
		receitaService.incluir(receita);

		model.addAttribute("nome", receita.getNome());

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/receita/{id}/excluir")
    public String excluir(Model model,@PathVariable Integer id,@SessionAttribute("user") Usuario usuario) {
       try {
           receitaService.excluir(id);

       }catch (Exception e) {
           model.addAttribute("msg", "Não foi possível excluir essa receita!");
       }

       return telaLista(model, usuario);
       
    }

}