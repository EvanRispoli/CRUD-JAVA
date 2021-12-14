package infnet.edu.br.Cadastro.model.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import infnet.edu.br.Cadastro.model.domain.Despesa;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.repository.DespesaRepository;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository despesaRepository;

    public void incluir (Despesa despesa){
        despesaRepository.save(despesa);

    }

    public void excluir (Integer id){
        despesaRepository.deleteById(id);

    }

    public Despesa obterPorId (Integer id){
        return despesaRepository.findById(id).orElse(null);

    }

    public List<Despesa> obterLista (Usuario usuario){
        return (List<Despesa>) despesaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));

    }
}
