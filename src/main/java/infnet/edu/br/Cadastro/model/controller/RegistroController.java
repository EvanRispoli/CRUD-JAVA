package infnet.edu.br.Cadastro.model.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import infnet.edu.br.Cadastro.model.domain.Categoria;
import infnet.edu.br.Cadastro.model.domain.Registro;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.CategoriaService;
import infnet.edu.br.Cadastro.model.service.RegistroService;
import infnet.edu.br.Cadastro.model.service.SolicitanteService;

@Controller
public class RegistroController {
	@Autowired
	private RegistroService registroService;
	@Autowired
	private CategoriaService categoriaService;
	@Autowired
	private SolicitanteService solicitanteService;

	@GetMapping(value = "/registro")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("registros", categoriaService.obterLista(usuario));

		model.addAttribute("solicitantes", solicitanteService.obterLista(usuario));

		return "registro/cadastro";
	}

	@GetMapping(value = "/registros")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaRegistros", registroService.obterLista(usuario));

		return "registro/lista";
	}

	@PostMapping(value = "/registro/incluir")
	public String incluir(Model model, Registro registro, @RequestParam String[] categoriaIds,
			@SessionAttribute("user") Usuario usuario) {

		List<Categoria> listaCategoria = new ArrayList<Categoria>();

		registro.setUsuario(usuario);

		for (String idCategoria : categoriaIds) {

			Categoria categoria = categoriaService.obterPorId(Integer.valueOf(idCategoria));

			listaCategoria.add(categoria);
		}

		registro.setCategorias(listaCategoria);

		registroService.incluir(registro);

		model.addAttribute("descricao", registro.getDescricao());

		return telaLista(model, usuario);
	}

	@GetMapping(value = "/registro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		registroService.excluir(id);

		return "redirect:/registros";
	}

}