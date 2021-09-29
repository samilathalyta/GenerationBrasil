package br.org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Gera uma tabela no banco
@Table (name = "tb_postagens") // define nome da tabela
public class Postagem {
	
	@Id // Indenfica como chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private long id;
	
	@NotNull(message = "O atributo titulo é obbrogatório!") 
	@Size(min = 5, max = 100,  message = "O atributo título deve ter no minimo 10 e no max 1000 caracteres!") // decide o tamanho minimo e maximo do atributo
	private String titulo;
	
	@NotNull(message = "O atributo texto é obbrogatório!")
	@Size(min = 10, max = 1000,  message = "O atributo título deve ter no minimo 5 e no max 100 caracteres!")
	private String texto;
	
	@Temporal(TemporalType.TIME) //tipo e tipo timestemp / timestamp não precisa passa dados. pega sozinho
	private Date data = new java.sql.Date(System.currentTimeMillis()) ;
	
	@ManyToOne
	@JsonIgnoreProperties // para travar e trazer uma ve só ainformação
	private Tema tema;
	
	
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

}
