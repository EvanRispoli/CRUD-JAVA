package infnet.edu.br.Cadastro.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import infnet.edu.br.Cadastro.model.domain.Receita;

@Repository
public interface ReceitaRepository extends CrudRepository<Receita, Integer> {
	@Query("from Receita r where r.usuario.id =:id")
	public List<Receita> findAll(Integer id, Sort by);
}
