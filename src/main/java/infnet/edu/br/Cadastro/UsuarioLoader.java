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
public class DataLoader implements ApplicationRunner  {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Endereco endereco = new Endereco();
		endereco.setCep("05409930");
		endereco.setLogradouro("Rua Oscar Freire");
		endereco.setComplemento("1546");
		endereco.setBairro("Pinheiros");
		endereco.setLocalidade("São Paulo");
		endereco.setUf("SP");


		Usuario usuario = new Usuario();
		usuario.setEmail("evan@rispoli.com");
		usuario.setNome("Evan Rispoli");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		usuario.setEndereco(endereco);
		usuarioService.incluir(usuario);
		
		Endereco endereco1 = new Endereco();
		endereco1.setCep("20010-020");
		endereco1.setLogradouro("Rua São José");
		endereco1.setComplemento("90");
		endereco1.setBairro("Centro");
		endereco1.setLocalidade("Rio de Janeiro");
		endereco1.setUf("RJ");
		
		
		Usuario usuario1 = new Usuario();
		usuario1.setEmail("rodrigo@magalhaes.com");
		usuario1.setNome("Rodrigo Magalhães");
		usuario1.setSenha("123");
		usuario1.setAdmin(true);
		usuario1.setEndereco(endereco1);
		usuarioService.incluir(usuario1);


}
}
