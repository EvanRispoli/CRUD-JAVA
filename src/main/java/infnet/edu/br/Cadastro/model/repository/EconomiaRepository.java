package infnet.edu.br.Cadastro.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import infnet.edu.br.Cadastro.model.domain.Economia;

@Repository
public interface EconomiaRepository extends CrudRepository<Economia, Integer> {
	
	@Query("from Economia e where e.usuario.id =:id")
	public List<Economia> findAll(Integer id, Sort sort);
}
