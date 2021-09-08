package exercicios;

public class ContaBancaria {
	private int agencia;
	private int conta;
	private String nome;
	
	public ContaBancaria(int agencia,  int conta,  String nome) {
		this.agencia = agencia;
		this.conta = conta;
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void imprimir() {
		System.out.println("\nNome: " + nome + "\nAgencia: " + agencia + "\nConta: " + conta);
	}
}
