package infnet.edu.br.Cadastro.model.service;

import infnet.edu.br.Cadastro.model.domain.Receita;
import infnet.edu.br.Cadastro.model.domain.Receita;
import infnet.edu.br.Cadastro.model.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {
    @Autowired
    private ReceitaRepository receitaRepository;

    public void incluir(Receita despesa) {
        receitaRepository.save(despesa);

    }

    public void excluir(Integer id) {
        receitaRepository.deleteById(id);

    }

    public Receita obterPorId(Integer id) {
        return receitaRepository.findById(id).orElse(null);

    }

    public List<Receita> obterLista() {
        return (List<Receita>) receitaRepository.findAll();

    }

}
