package exercicios;

public class TesteBanco {

	public static void main(String[] args) {
		
		ContaBancaria dados = new ContaBancaria(23566-9, 1345-6, "Samila Thalyta");
			
		dados.imprimir();
		System.out.println("=================MUDANÇA============");
		dados.setAgencia(12546-9);
		dados.imprimir();
	}

}
