package br.org.generation.lojadegames.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome nao pode estar vazio")
	@Size(min=2, max=30, message = "O atributi nome deve ter n minimo 05 carcateres e no maximo 30 caracteres!")
	private String nome;
	
	@NotNull(message = "O atributo nome nao pode estar vazio")
	@Size(min=2, max=255, message = "O atributi nome deve ter n minimo 05 carcateres e no maximo 255 caracteres!")
	private String descricao;
	
	@Temporal(TemporalType.TIME) //tipo e tipo timestemp / timestamp não precisa passa dados. pega sozinho
	private Date data = new java.sql.Date(System.currentTimeMillis()) ;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
