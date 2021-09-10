package abstracao2;

public class Cachorro extends Animal {
	public Cachorro( ){
		super("Animal cachorro");
	}

	@Override
	public void emitirSom(int som) {
		switch(som) {
		case 1:
			System.out.println("\nAU AU AU!!!");
			break;
		case 2: 
			System.out.println("\nHI HI HI HI!!!");
			break;
		case 3:
			System.out.println("\nHAR HAR HAR");
		}
		
	}

	@Override
	public void deveCorrer(String correr) {
		System.out.println("\nCorrendo..." + correr);
		
	}
	
	
}
