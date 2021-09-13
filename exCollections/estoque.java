package exCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class estoque {
	public static void main(String[] args) {
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList <String>();
		
		do {
		System.out.println("\n\t=== Lista de opções ===");
		System.out.println("\n[1] Adicinar produtos no estoque: ");
		System.out.println("\n[2] Remover produtos no estoque: ");
		System.out.println("\n[3] Atualizar produtos no estoque: ");
		System.out.println("\n[4] Mostrar todos os produtos no estoque: ");
		System.out.println("\n[5] Deseja encerrar? \n");
		System.out.println("\nDigite a opção desejada: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1: 
			leia.nextLine();
			System.out.println("\nO que voce deseja adicinar?");
			String adicionei = leia.nextLine();
			estoque.add(adicionei);
			System.out.println(estoque);
			break;
		case 2:
			System.out.println("\nO que voce deseja remover?");
			leia.nextLine();
			String remove = leia.nextLine();
			if(estoque.contains(remove)) {
				estoque.remove(remove);
				System.out.println(estoque);
			}else {
				System.out.println("\nProduto não existe!");
			}
			break;
		case 3:
			leia.nextLine();
			System.out.println("\nDigite o nome do produto que quer atualizar: ");
			String atualizar = leia.nextLine();
			
			System.out.println("\nDigite o nome do produto que vai ser trocado por " + atualizar );
			String trocar = leia.nextLine();
			
			if(estoque.contains(atualizar)) {
				estoque.remove(atualizar);
				estoque.add(trocar);
				System.out.println(estoque);
			}else {
				System.out.println("\nProduto inexistente");
			}
			break;
		case 4:
		
				System.out.println(estoque);
				break;
	default:
		System.out.println("Opção inválida");
			}
			
		}while(op != 0);
	
	}
}
