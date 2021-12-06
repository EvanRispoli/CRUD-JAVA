package infnet.edu.br.Cadastro.model.controller;
import infnet.edu.br.Cadastro.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.UsuarioService;


@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	@GetMapping(value = "/usuarios")
	public String telaLista(Model model) {
		
		model.addAttribute("listaUsuarios", usuarioService.obterLista());
		
		
		return "usuario/lista";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Model model, Usuario usuario, Endereco endereco) {

		usuario.setEndereco(endereco);
		usuarioService.incluir(usuario);

		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		usuarioService.excluir(id);

		return "redirect:/usuarios";
	}
}