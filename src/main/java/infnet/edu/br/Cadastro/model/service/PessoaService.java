package infnet.edu.br.Cadastro.model.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infnet.edu.br.Cadastro.model.domain.Pessoa;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Pessoa> obterLista() {

		return (List<Pessoa>)pessoaRepository.findAll();
	}
	public List<Pessoa> obterLista(Usuario usuario) {
		
		return (List<Pessoa>)pessoaRepository.obterLista(usuario.getId());
	}

	public void incluir(Pessoa pessoa) {
		
		pessoaRepository.save(pessoa); 		
	}
	
	public void excluir(Integer id) {
		pessoaRepository.deleteById(id);
	}
}