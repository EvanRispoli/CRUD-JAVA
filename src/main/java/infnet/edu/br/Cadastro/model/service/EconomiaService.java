package infnet.edu.br.Cadastro.model.service;

import infnet.edu.br.Cadastro.model.domain.Economia;
import infnet.edu.br.Cadastro.model.domain.Receita;
import infnet.edu.br.Cadastro.model.repository.EconomiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EconomiaService {
    @Autowired
    private EconomiaRepository economiaRepository;

    public void incluir(Economia economia) {
        economiaRepository.save(economia);

    }

    public void excluir(Integer id) {
        economiaRepository.deleteById(id);

    }

    public Economia obterPorId(Integer id) {
        return economiaRepository.findById(id).orElse(null);

    }

    public List<Economia> obterLista() {
        return (List<Economia>) economiaRepository.findAll();

    }
}
