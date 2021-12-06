package infnet.edu.br.Cadastro.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import infnet.edu.br.Cadastro.model.domain.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

	@Query("from Pessoa u where u.usuario.id =:id")
	public List<Pessoa> obterLista(Integer id);

}
