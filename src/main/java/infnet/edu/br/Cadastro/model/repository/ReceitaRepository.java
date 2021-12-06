package infnet.edu.br.Cadastro.model.repository;

import infnet.edu.br.Cadastro.model.domain.Receita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends CrudRepository<Receita, Integer> {
}
