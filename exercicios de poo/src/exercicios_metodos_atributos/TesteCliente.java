package exercicios;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente [] lista = new Cliente[3];
		lista[0] = new Cliente ("Thalyta", "feminino", 23);
		lista[1] = new Cliente ("Jao", "masculino", 50);
		lista[2] = new Cliente ("Fulano", "outras", 29);
		
		for (Cliente roda:lista) {
			roda.imprimirInfo();
		}
		

	}

}
