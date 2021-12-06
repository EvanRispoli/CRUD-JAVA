package infnet.edu.br.Cadastro.model.service;

import infnet.edu.br.Cadastro.model.domain.Despesa;
import infnet.edu.br.Cadastro.model.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Despesa> obterLista (){
        return (List<Despesa>) despesaRepository.findAll();

    }
}
