package infnet.edu.br.Cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import infnet.edu.br.Cadastro.model.domain.Endereco;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner  {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		Endereco endereco = new Endereco();
		endereco.setCep("20010-020");
		endereco.setLogradouro("Rua São José");
		endereco.setComplemento("90");
		endereco.setBairro("Centro");
		endereco.setLocalidade("Rio de Janeiro");
		endereco.setUf("RJ");
		
		
		Usuario usuario = new Usuario();
		usuario.setEndereco(endereco);
		usuario.setEmail("rodrigo@magalhaes.com");
		usuario.setNome("Rodrigo Magalhães");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		
		usuarioService.incluir(usuario);


}
}
