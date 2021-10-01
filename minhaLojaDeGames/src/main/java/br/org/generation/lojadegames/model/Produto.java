package br.org.generation.lojadegames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome nao pode estar vazio")
	@Size(min=2, max=30, message = "O atributi nome deve ter n minimo 05 carcateres e no maximo 30 caracteres!")
	private String nome;
	
	@NotNull(message = "O atributo nome nao pode estar vazio")
	@Size(min=2, max=30, message = "O atributi nome deve ter n minimo 05 carcateres e no maximo 30 caracteres!")
	
	@NotNull
	private float preco;
	
	@NotNull(message = "O atributo nome nao pode estar vazio")
	@Size(min=2, max=255, message = "O atributi nome deve ter n minimo 05 carcateres e no maximo 255 caracteres!")
	private String descricao;
	
	
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


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<Categoria> getCategoria() {
		return categoria;
	}


	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}


	@ManyToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Categoria> categoria;
}
