package infnet.edu.br.Cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import infnet.edu.br.Cadastro.model.domain.Solicitante;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.SolicitanteService;

@Component
@Order(2)
public class SolicitanteLoader implements ApplicationRunner {

	@Autowired
	private SolicitanteService solicitanteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Solicitante solicitante = new Solicitante("Evan Rispoli", "123.456.789-12", "evan@rispoli.com");
		solicitante.setUsuario(usuario);
		
		solicitanteService.incluir(solicitante);
	}

}
