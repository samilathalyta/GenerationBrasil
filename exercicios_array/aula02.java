package exercicios_array;

import java.util.Scanner;

public class aula02 {

	public static void main(String[] args) {
		
		int linha = 2, coluna = 3;
		int numeros[][] = new int [linha][coluna];
		int contMais10 = 0, contMenos10 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l = 0; l < linha; l++) {
			for(int c = 0; c < coluna; c++) {
				System.out.println("\nDigite um número: ");
				numeros[l][c]= leia.nextInt();
								
			}
		}
		for(int l = 0; l < linha; l++) {
			for(int c = 0; c < coluna; c++) {
				if(numeros[l][c] > 10) {
					contMais10++;
					System.out.println("\n" + numeros[l][c] + "----> Maior que 10");
				}if (numeros[l][c] < 10) {
					contMenos10++;
					System.out.println("\n" + numeros[l][c] + "----> Menor que 10");
				}
			}
		}
		System.out.println("\nTemos: " + contMais10 + " numero(s) maior que 10...");
		System.out.println("\nTemos: " + contMais10 + " numero(s) menos que 10...");
		
	}

}
