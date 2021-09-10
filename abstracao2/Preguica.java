package abstracao2;

public class Preguica extends Animal {
public Preguica() {
	super("Animal Preguica");
}

@Override
public void emitirSom(int som) {
for (int i=1; i< som; i++) {
		System.out.println("\n HA HA HA");
	}
}

@Override
public void deveCorrer(String correr) {
	System.out.println("\nCorrendo..." + correr);
	
}

}
