package abstracao;

public class Quadrado extends BaseFigura implements Figuras {
	
	Quadrado(double lado, String nome){
		super(lado, lado, nome);
		nomeClasse = "Quadrado"; 
	}
	//argumentos para a superclasse
	public double getDiagonal() {
		return Math.sqrt(2) * lado1;
	}
	@Override
	public Void SetNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
