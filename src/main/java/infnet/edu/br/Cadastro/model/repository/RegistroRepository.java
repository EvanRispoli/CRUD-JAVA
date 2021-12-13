package infnet.edu.br.Cadastro.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import infnet.edu.br.Cadastro.model.domain.Registro;


@Repository
public interface RegistroRepository extends CrudRepository<Registro, Integer>{
	
	@Query("from Registro r where r.usuario.id = :id")
	public List<Registro> findAll(Integer id, Sort by);

}
