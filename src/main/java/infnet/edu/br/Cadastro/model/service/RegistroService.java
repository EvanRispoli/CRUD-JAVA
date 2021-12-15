package infnet.edu.br.Cadastro.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import infnet.edu.br.Cadastro.model.domain.Registro;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.repository.RegistroRepository;

@Service
public class RegistroService {
    @Autowired
    private RegistroRepository registroRepository;

    public void incluir (Registro registro){
        registroRepository.save(registro);

    }

    public void excluir (Integer id){
        registroRepository.deleteById(id);

    }

    public Registro obterPorId (Integer id){
        return registroRepository.findById(id).orElse(null);

    }

    public List<Registro> obterLista (Usuario usuario){
        return (List<Registro>) registroRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "descricao"));

    }
}
