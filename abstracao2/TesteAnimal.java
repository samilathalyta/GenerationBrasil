package abstracao2;

public class TesteAnimal {

	public static void main(String[] args) {
		
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo = new Cavalo();
			Preguica preguica = new Preguica();
			Animal animal = null;

			int n = (int) (Math.random()*3.0);
			System.out.println("\nO número escolhido foi: " + n);
			
			switch(n) {
			case 1:
				animal = cachorro; break;
			case 2:
				animal = cavalo; break;
			case 3:
				animal = preguica; break;
				default: System.out.println("\nErrro!");
			}
if(animal != null) {
	animal.deveCorrer("Correndo");
	animal.emitirSom(3);
}


	}

}
