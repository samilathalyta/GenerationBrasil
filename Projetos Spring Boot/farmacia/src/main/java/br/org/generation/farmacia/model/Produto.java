package br.org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")

public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long Id;
	
	@NotNull(message = "O atributo nome é obbrogatório!") 
	@Size(min = 2, max = 100,  message = "O atributo nome deve ter no minimo 2 e no max 1000 caracteres!")
	private String nome;
	
	private float preco;
	
	private int quantidade;
	
	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL) // TUDO QUE TIVER ASSOCIADO, VAI JUNTO (APAGAR)
	@JsonIgnoreProperties("produto") //para não ter o looping infinito na hora de criar o List
	private List<Categoria> categoria;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	
	
}
