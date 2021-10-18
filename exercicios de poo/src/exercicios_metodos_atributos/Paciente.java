package exercicios;

public class Paciente {
	private String nome, situacao;
	private int nQuarto, idade;
	
	public Paciente(String nome, String situacao, int nQuarto, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.nQuarto = nQuarto;
		this.situacao = situacao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getnQuarto() {
		return nQuarto;
	}

	public void setnQuarto(int nQuarto) {
		this.nQuarto = nQuarto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimir() {
		System.out.println("\n Nome do paciente: " + nome + "\nIdade: " + idade + "\nNúmero do quarto: " + "\nSituação: " + situacao);
	}
}
