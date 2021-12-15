package infnet.edu.br.Cadastro.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import infnet.edu.br.Cadastro.model.domain.Categoria;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public void excluir(Integer id) {
		categoriaRepository.deleteById(id);
	}

	public Categoria obterPorId(Integer id) {
		return categoriaRepository.findById(id).orElse(null);
	}
	public List<Categoria> obterLista(Usuario usuario){
		return (List<Categoria>) categoriaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

}
