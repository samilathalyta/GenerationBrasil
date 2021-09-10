package abstracao;

public class Retangulo extends BaseFigura implements Figuras {
	Retangulo(double  lado1, double lado2, String nome){
		super(lado1, lado2, nome);
		nomeClasse = "Retangulo";
	}

	@Override
	public Void SetNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDiagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(lado1,2)+ Math.pow(lado2,2));
	}

}
