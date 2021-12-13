package infnet.edu.br.Cadastro.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registros")
public class Registro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private LocalDateTime data;
    @OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idSolicitante")
	private Solicitante solicitante;
    private String descricao;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Categoria> categorias;
    private boolean planejado;
    @ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
    

	public Registro() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append(";");
		sb.append(data.format(formato));
		sb.append(";");
		sb.append(planejado ? "sim" : "nao");
		sb.append(";");
		sb.append(solicitante.toString());
		sb.append(";");
		sb.append(descricao.toString());
		sb.append(";");
		sb.append(usuario.toString());
		sb.append(";");
		if(categorias != null) {
			sb.append(categorias.size());
		}
		
		return sb.toString();
	}







	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public boolean isPlanejado() {
		return planejado;
	}

	public void setPlanejado(boolean planejado) {
		this.planejado = planejado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
}
