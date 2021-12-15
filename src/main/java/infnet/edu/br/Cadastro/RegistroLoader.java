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
import infnet.edu.br.Cadastro.model.domain.Economia;
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
		
		Solicitante solicitante = new Solicitante();
		solicitante.setId(1);

		Despesa despesa = new Despesa();		
		despesa.setId(1);
		
		Receita salario = new Receita();		
		salario.setId(2);
		
		Economia economia = new Economia();
		economia.setId(3);
		
		
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(despesa);
		categorias.add(salario);
		categorias.add(economia);
				
		Registro registro = new Registro();
		registro.setDescricao("Registro Principal Loader");
		registro.setCategorias(categorias);
		registro.setSolicitante(solicitante);
		registro.setUsuario(usuario);
		registro.setPlanejado(true);
		registroService.incluir(registro);
	}


	}


