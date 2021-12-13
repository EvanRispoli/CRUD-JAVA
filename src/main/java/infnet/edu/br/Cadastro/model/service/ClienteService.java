package infnet.edu.br.Cadastro.model.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infnet.edu.br.Cadastro.model.domain.Cliente;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> obterLista() {

		return (List<Cliente>)clienteRepository.findAll();
	}
	public List<Cliente> obterLista(Usuario usuario) {
		
		return (List<Cliente>)clienteRepository.obterLista(usuario.getId());
	}

	public void incluir(Cliente cliente) {
		
		clienteRepository.save(cliente); 		
	}
	
	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}
}