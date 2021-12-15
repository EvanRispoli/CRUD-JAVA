package infnet.edu.br.Cadastro.model.repository;

import infnet.edu.br.Cadastro.model.domain.Despesa;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespesaRepository extends CrudRepository<Despesa, Integer> {
    @Query("from Despesa d where d.usuario.id =:id")
    public List<Despesa> findAll(Integer id, Sort by);
}
