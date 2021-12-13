package infnet.edu.br.Cadastro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import infnet.edu.br.Cadastro.model.domain.Categoria;
import infnet.edu.br.Cadastro.model.domain.Despesa;
import infnet.edu.br.Cadastro.model.domain.Receita;
import infnet.edu.br.Cadastro.model.domain.Registro;
import infnet.edu.br.Cadastro.model.domain.Solicitante;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.RegistroService;

@Component
@Order(4)
public class RegistroLoader implements ApplicationRunner {
	@Autowired
	private RegistroService registroService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Despesa conta = new Despesa();		
		conta.setId(1);
		
		Receita salario = new Receita();		
		salario.setId(2);

		Solicitante solicitante = new Solicitante();
		solicitante.setId(1);
		
		List<Categoria> listaCategorias = new ArrayList<Categoria>();
		listaCategorias.add(conta);
		listaCategorias.add(salario);
				
		Registro registro = new Registro();
		registro.setDescricao("Registro Principal Loader");
		registro.setCategorias(listaCategorias);
		registro.setSolicitante(solicitante);
		registro.setUsuario(usuario);
		registro.setPlanejado(true);
		registroService.incluir(registro);
	}


	}


