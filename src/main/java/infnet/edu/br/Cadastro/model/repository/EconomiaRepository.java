package infnet.edu.br.Cadastro.model.repository;

import infnet.edu.br.Cadastro.model.domain.Economia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EconomiaRepository extends CrudRepository<Economia, Integer> {
}
