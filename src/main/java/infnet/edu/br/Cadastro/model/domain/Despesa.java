package infnet.edu.br.Cadastro.model.domain;

import infnet.edu.br.Cadastro.exception.BeneficiarioVazioException;

import javax.persistence.*;

@Entity
@Table(name = "despesas")
public class Despesa extends Categoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String beneficiario;
    private int opcaoRecorrencia;
    private String recorrencia;



    public Despesa() {
        super();
    }

    public Despesa(String dataVencimento, String nome, String comentario, String categoria, boolean recorrente, float valor, String tipo) {
        super(dataVencimento, nome, comentario, categoria, recorrente, valor, tipo);
    }


    @Override
    public String determinaRecorrencia() {
        if(isRecorrente() == false || opcaoRecorrencia == 0 ||opcaoRecorrencia >5){
            setRecorrencia("Lançamento Único");
        }else if(opcaoRecorrencia == 1){
            setRecorrencia("Lançamento Quinzenal");
        }else if(opcaoRecorrencia == 2){
            setRecorrencia("Lançamento Mensal");
        }else if(opcaoRecorrencia == 3) {
            setRecorrencia("Lançamento Trimestral");
        }else if(opcaoRecorrencia == 4) {
            setRecorrencia("Lançamento Semestral");
        }else if(opcaoRecorrencia == 5) {
            setRecorrencia("Lançamento Anual");
        }
        else{
            setRecorrencia("Lançamento Único");
        }

        return getRecorrencia();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) throws BeneficiarioVazioException {
        if(beneficiario == ""){
            throw new BeneficiarioVazioException("O campo Beneficiario precisa ser preenchido");
        }
        this.beneficiario = beneficiario;
    }

    public int getOpcaoRecorrencia() {
        return opcaoRecorrencia;
    }

    public void setOpcaoRecorrencia(int opcaoRecorrencia) {
        this.opcaoRecorrencia = opcaoRecorrencia;
    }

    public String getRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(String recorrencia) {
        this.recorrencia = recorrencia;
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "beneficiario='" + beneficiario + '\'' +
                ", opcaoRecorrencia=" + opcaoRecorrencia +
                ", recorrencia='" + recorrencia + '\'' +
                '}';
    }
}
