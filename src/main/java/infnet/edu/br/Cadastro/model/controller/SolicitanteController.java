package infnet.edu.br.Cadastro.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import infnet.edu.br.Cadastro.model.domain.Solicitante;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.SolicitanteService;

@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteService solicitanteService;

	@GetMapping(value = "/solicitante")
	public String telaCadastro() {
		return "solicitante/cadastro";
	}
	
	@GetMapping(value = "/solicitantes")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaSolicitantes", solicitanteService.obterLista(usuario));
		
		return "solicitante/lista";
	}

	@PostMapping(value = "/solicitante/incluir")
	public String incluir(Model model, Solicitante solicitante, @SessionAttribute("user") Usuario usuario) {
		
		solicitante.setUsuario(usuario);
		
		solicitanteService.incluir(solicitante);

		model.addAttribute("nome", solicitante.getNome());

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
    public String excluir(Model model,@PathVariable Integer id,@SessionAttribute("user") Usuario usuario) {
       try {
           solicitanteService.excluir(id);

       }catch (Exception e) {
           model.addAttribute("msg", "Não foi possível excluir essa solicitante!");
       }

       return telaLista(model, usuario);
       
    }

}