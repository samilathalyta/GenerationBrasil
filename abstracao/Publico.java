package abstracao;

public class Publico extends Telefone {
	public  Publico() {
		super("Telefone fixo"); //passagem de parametro para a superclasse
	}
	@Override
	public void toca(int numToque) {
		for(int i=0; i<numToque; i++) {
			System.out.println("\nTruuiiim Truuiiim Trumm");
		}
		
	}
	@Override
	public void disca(String numero) {
		if(numero.charAt(0) =='9' || numero.charAt(0)== '8') { //charAT = pegar atraves do charAT o primeiro carcter
			System.out.println("\nEsse numero não liga para celualar");
		}else {
			System.out.println("Discando..." + numero);
			}
		
	}

	
	
}
