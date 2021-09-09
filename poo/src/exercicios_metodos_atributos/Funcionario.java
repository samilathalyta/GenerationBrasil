/*Crie uma classe funcionário e apresente os atributos e métodos
*referentes esta classe, em seguida crie um objeto funcionário, defina as
*instancias deste objeto e apresente as informações deste objeto no
console.*/
package exercicios;

public class Funcionario {
	private String nome;
	private int matricula;
	private String cargo;
	
	public Funcionario(int matricula,  String nome, String cargo ) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void imprimir() {
		System.out.println("\nFuncionario: "  + nome + "\nMatricula: " +  matricula + "\nCargo: " + cargo);
	}
}
