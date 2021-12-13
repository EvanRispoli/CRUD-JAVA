package infnet.edu.br.Cadastro.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import infnet.edu.br.Cadastro.model.domain.Cliente;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping(value = "/cliente")
	public String telaCadastro() {
		return "cliente/cadastro";
	}

	@GetMapping(value = "/clientes")
	public String telaLista(Model model,  @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaClientes", clienteService.obterLista(usuario));

		return "cliente/lista";
	}

	@PostMapping(value = "/cliente/incluir")
	public String incluir(Model model, Cliente cliente, @SessionAttribute("user") Usuario usuario) {
		
		cliente.setUsuario(usuario);

		clienteService.incluir(cliente);

		model.addAttribute("nome", cliente.getNome());
		// return "redirect:/clientes";
		return telaLista(model, usuario);
	}

	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		clienteService.excluir(id);

		return "redirect:/clientes";
	}

}
