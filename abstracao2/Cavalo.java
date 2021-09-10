package abstracao2;

public class Cavalo extends Animal {
	public Cavalo () {
		super("Animal Cavalo");
	}

	@Override
	public void emitirSom(int som) {
		for (int i=1; i< som; i++) {
			System.out.println("\n HI HI HI");
		}
		
	}

	@Override
	public void deveCorrer(String correr) {
		System.out.println("\nCorrendo..." + correr);
		
	}
	

}
