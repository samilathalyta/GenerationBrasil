package abstracao;

public class Fixo extends Telefone{
	public  Fixo() {
		super("Telefone fixo"); //passagem de parametro para a superclasse
	}
	public void toca(int numToques) { //implementando um medoto da minha classe
		for(int i=0; i<numToques; i++) {
			System.out.println("\nTruum Truum Trumm");
		}
	}
	@Override
	public void disca(String numero) { // implementando um metodo
		System.out.println("\nDiscando....."+ numero);
		
	}
}
