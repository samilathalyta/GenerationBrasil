package exercicios;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao (100, 100, "GOL");
		
		aviao.imprimir();
		System.out.println("=========== Atualizando qauntidade de passageiros =============");
		aviao.setQtdPassageiros(85);
		aviao.imprimir();
		System.out.println("\nHá poltronas disponíveis\n");
		System.out.println("=========== Atualizando qauntidade de Passageiros =============");
		aviao.setQtdPassageiros(100);
		aviao.imprimir();
		System.out.println("\nNão há poltronas disponíveis");
		
	
	

	}

}
