package infnet.edu.br.Cadastro.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import infnet.edu.br.Cadastro.model.domain.Categoria;


@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
	@Query("from Categoria c where c.usuario.id =:id")
	public List<Categoria> findAll(Integer id, Sort by);

}
