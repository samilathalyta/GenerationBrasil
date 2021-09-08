package exercicios;

public class Cliente {
	private String nome;
	private String sexo;
	private int idade;
	
	public Cliente  (String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprimirInfo() {
		System.out.println("\nNome: " + nome +  "\nSexo:  " + sexo + "\nIdade: " + idade);
	}
	
}
