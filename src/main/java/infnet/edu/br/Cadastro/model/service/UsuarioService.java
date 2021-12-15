package infnet.edu.br.Cadastro.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;


import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.repository.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario autenticacao(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> obterLista(){
		return (List<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);		
	}

	public Integer obterQtde() {
		return (int) usuarioRepository.count();
	}
}