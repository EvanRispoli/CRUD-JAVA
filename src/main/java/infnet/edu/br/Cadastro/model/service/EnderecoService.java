package infnet.edu.br.Cadastro.model.service;

import infnet.edu.br.Cadastro.client.IEnderecoClient;
import infnet.edu.br.Cadastro.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private IEnderecoClient enderecoClient;

    public Endereco getEnderecoByCep(String cep) {

        return enderecoClient.buscarCep(cep);
    }
}
