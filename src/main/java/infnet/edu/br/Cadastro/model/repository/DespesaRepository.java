package infnet.edu.br.Cadastro.model.repository;

import infnet.edu.br.Cadastro.model.domain.Despesa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespesaRepository extends CrudRepository<Despesa, Integer> {
    @Query("from Despesa d where d.id =:id")
    public List<Despesa> obterLista(Integer id);
}
