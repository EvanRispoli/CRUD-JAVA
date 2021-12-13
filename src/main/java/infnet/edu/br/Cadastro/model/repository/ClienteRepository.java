package infnet.edu.br.Cadastro.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import infnet.edu.br.Cadastro.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

	@Query("from Cliente u where u.usuario.id =:id")
	public List<Cliente> obterLista(Integer id);

}
