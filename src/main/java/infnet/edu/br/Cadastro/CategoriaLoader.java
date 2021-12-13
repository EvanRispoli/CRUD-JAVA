package infnet.edu.br.Cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import infnet.edu.br.Cadastro.exception.BeneficiarioVazioException;
import infnet.edu.br.Cadastro.exception.FonteVaziaInvalidaException;
import infnet.edu.br.Cadastro.exception.ObjetivoVazioInvalido;
import infnet.edu.br.Cadastro.model.domain.Despesa;
import infnet.edu.br.Cadastro.model.domain.Economia;
import infnet.edu.br.Cadastro.model.domain.Receita;
import infnet.edu.br.Cadastro.model.domain.Usuario;
import infnet.edu.br.Cadastro.model.service.DespesaService;
import infnet.edu.br.Cadastro.model.service.EconomiaService;
import infnet.edu.br.Cadastro.model.service.ReceitaService;

@Component
@Order(3)
public class CategoriaLoader implements ApplicationRunner {
	@Autowired
	private DespesaService despesaService;
	@Autowired
	private ReceitaService receitaService;
	@Autowired
	private EconomiaService economiaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Receita receita = new Receita();
		receita.setFonte("Infnet");
		receita.setNome("Salario");
		receita.setCategoria("Salario");
		receita.setComentario("Quinzena 1");
		receita.setOpcaoRecorrencia(2);
		receita.setValor((float) 6532.36);
		receita.setTipo("Esperado");
		receita.setDataVencimento("30/12/2021");
		receita.determinaRecorrencia();
		receitaService.incluir(receita);

		Despesa despesa = new Despesa();
		despesa.setBeneficiario("VIVO");
		despesa.setNome("Telefone");
		despesa.setCategoria("Contas");
		despesa.setComentario("Atrasado");
		despesa.setOpcaoRecorrencia(2);
		despesa.setValor((float) 250.36);
		despesa.setTipo("Necessario");
		despesa.setDataVencimento("12/12/2021");
		despesa.determinaRecorrencia();
		despesaService.incluir(despesa);

		Economia economia = new Economia();
		economia.setObjetivo("Viagem");
		economia.setNome("Telefone");
		economia.setCategoria("Contas");
		economia.setComentario("Atrasado");
		economia.setOpcaoRecorrencia(2);
		economia.setValor((float) 250.36);
		economia.setTipo("Necessario");
		economia.setDataVencimento("12/12/2021");
		economia.determinaRecorrencia();
		economiaService.incluir(economia);

	}
}
