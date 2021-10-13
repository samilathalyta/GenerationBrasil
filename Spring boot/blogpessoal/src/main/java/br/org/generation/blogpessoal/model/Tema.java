package br.org.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Gera uma tabela no banco
@Table (name = "tb_temas") 
public class Tema {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long Id;
	

	@NotNull(message = "O atributo titulo é obbrogatório!") 
	@Size(min = 2, max = 100,  message = "O atributo título deve ter no minimo 10 e no max 1000 caracteres!")
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL) // TUDO QUE TIVER ASSOCIADO, VAI JUNTO (APAGAR)
	@JsonIgnoreProperties("tema") //para não ter o looping infinito na hora de criar o List
	private List<Postagem> postagem;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
}
