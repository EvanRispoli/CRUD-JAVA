package infnet.edu.br.Cadastro;

import infnet.edu.br.Cadastro.model.domain.Endereco;
import infnet.edu.br.Cadastro.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import infnet.edu.br.Cadastro.model.domain.Usuario;

@Component
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


}
}
