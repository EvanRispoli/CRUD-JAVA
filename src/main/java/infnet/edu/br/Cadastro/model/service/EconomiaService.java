package infnet.edu.br.Cadastro.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import infnet.edu.br.Cadastro.model.domain.Economia;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.repository.EconomiaRepository;

@Service
public class EconomiaService {
    @Autowired
    private EconomiaRepository economiaRepository;

    public void incluir (Economia economia){
        economiaRepository.save(economia);

    }

    public void excluir (Integer id){
        economiaRepository.deleteById(id);

    }

    public Economia obterPorId (Integer id){
        return economiaRepository.findById(id).orElse(null);

    }

    public List<Economia> obterLista (Usuario usuario){
        return (List<Economia>) economiaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));

    }
}