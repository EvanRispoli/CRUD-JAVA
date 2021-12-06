package infnet.edu.br.Cadastro;

import infnet.edu.br.Cadastro.exception.BeneficiarioVazioException;
import infnet.edu.br.Cadastro.exception.FonteVaziaInvalidaException;
import infnet.edu.br.Cadastro.exception.ObjetivoVazioInvalido;
import infnet.edu.br.Cadastro.model.domain.Despesa;
import infnet.edu.br.Cadastro.model.domain.Economia;
import infnet.edu.br.Cadastro.model.domain.Receita;
import infnet.edu.br.Cadastro.model.service.DespesaService;
import infnet.edu.br.Cadastro.model.service.EconomiaService;
import infnet.edu.br.Cadastro.model.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ProdutoLoader implements ApplicationRunner {
 @Autowired
    private DespesaService despesaService;
    @Autowired
    private ReceitaService receitaService;
    @Autowired
    private EconomiaService economiaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Receita receita = new Receita(
                "01/11/2021",
                "Salario",
                "Quinzena 1",
                "Renda extra",
                true,
                100,
                "Desejado");
        try {
            receita.setFonte("Prof. Elberth");
        } catch (FonteVaziaInvalidaException e) {
            e.getMessage();
        }
        receita.setOpcaoRecorrencia(0);

        receitaService.incluir(receita);

        Despesa despesa = new Despesa("15/10/2021",
                "Conta de luz",
                "",
                "Moradia",
                true,
                (float) 225.52,
                "Necessario");
        try {
            despesa.setBeneficiario("LIGHT");
        } catch (BeneficiarioVazioException e) {
            e.getMessage();
        }
        despesa.setOpcaoRecorrencia(2);
        despesa.determinaRecorrencia();

        despesaService.incluir(despesa);

        Despesa despesa1 = new Despesa("15/12/2021",
                "Telefone",
                "Acima do normal",
                "Contas",
                true,
                (float) 150,
                "Necessario");
        try {
            despesa1.setBeneficiario("VIVO");
        } catch (BeneficiarioVazioException e) {
            e.getMessage();
        }
        despesa1.setOpcaoRecorrencia(2);
        despesa1.determinaRecorrencia();

        despesaService.incluir(despesa1);


       Economia economia = new Economia(
                "30/10/2021",
                "Vai que...",
                "Conta Poupança",
                "Economias",
                true,
                500,
                "Desejável");
        try {
            economia.setObjetivo("Ferias 2022");

        } catch (ObjetivoVazioInvalido e) {
            e.getMessage();
        }
        economia.setOpcaoRecorrencia(1);

        economiaService.incluir(economia);

    }
}
