package infnet.edu.br.Cadastro.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "categorias")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String dataVencimento;
    private String nome;
    private String comentario;
    private String categoria;
    @Transient
    private boolean recorrente;
    private float valor;
    private String tipo;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	
	@ManyToMany(mappedBy = "categorias")
	private List<Registro> registros;

    public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria() {

    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public abstract String determinaRecorrencia();

    public Categoria(String dataVencimento, String nome, String comentario, String categoria, boolean recorrente, float valor, String tipo) {
        this.dataVencimento = dataVencimento;
        this.nome = nome;
        this.comentario = comentario;
        this.categoria = categoria;
        this.recorrente = recorrente;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "dataVencimento='" + dataVencimento + '\'' +
                ", nome='" + nome + '\'' +
                ", comentario='" + comentario + '\'' +
                ", categoria='" + categoria + '\'' +
                ", recorrente=" + recorrente +
                ", valor=" + valor +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
