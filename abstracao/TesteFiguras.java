package abstracao;

public class TesteFiguras {

	public static void main(String[] args) {
		Quadrado fig1 = new Quadrado(10,"Quadrado1 ");
		Retangulo fig2 = new Retangulo(3,4, "Retangulo 1");
				System.out.println("\n"+fig1.getNome() + ": " + fig1.getDiagonal());
				System.out.println("\n"+fig2.getNome() + ": " + fig2.getDiagonal());

	}

}
