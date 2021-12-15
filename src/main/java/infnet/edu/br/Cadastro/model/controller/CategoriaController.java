package infnet.edu.br.Cadastro.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.CategoriaService;

@Controller
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping(value = "/categorias")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaCategorias", categoriaService.obterLista(usuario));

		return "categoria/lista";
	}

	@GetMapping(value = "/categoria/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		try {
			categoriaService.excluir(id);

		} catch (Exception e) {
			model.addAttribute("msg", "Não foi possível excluir essa categoria!");
		}

		return telaLista(model, usuario);

	}

}
