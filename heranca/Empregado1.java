package heranca;

public class Empregado1 extends Pessoa {
	
	private int codigo;
	private float salario;
	private float imposto;
	
	public Empregado1 (String nome, String endereco, String cpf, int telefone, int idade, int codigo,  float salario,  float imposto) {
		super(nome, endereco, cpf, telefone, idade);
		this.codigo = codigo;
		this.salario = salario;
		this.imposto = imposto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()
		+"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()
		+"\nCódigo do setor: "+codigo+"\nSalário base: "+salario
		+"\nValor em porcentagem(sem o %) de imposto a ser retido do salário: "+imposto);
	}
	public void calcularSalario()
	{
		double salario_total = salario - (salario * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregado: "+getNome()
		+" é igual a: "+salario_total);
	}

}
