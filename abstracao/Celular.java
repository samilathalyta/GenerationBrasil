package abstracao;

public class Celular extends Telefone{

	public  Celular() {
		super("Toca telefone");
	}
	@Override //indica asssinatura de referencia para a sobreecrita do metodo polimorfico
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("tanana");
			break;
		case 2:
			System.out.println("trililim...tirilim");
			break;
		case 3:
			System.out.println("Tararam....tararamm");
		}
	} 
	@Override
	public void disca(String numero) {
		System.out.println("\nO numero: "+numero+ " é um celular!");
	}
}
