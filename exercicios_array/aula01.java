package exercicios_array;

import java.util.Scanner;

public class aula01 {

	public static void main(String[] args) {
		
		float media [] = new float [4];
		float somaMedia = 0, mediaGeral;
		
		
		Scanner leia = new Scanner (System.in);
		
		for(int x=0; x<4; x++) {
			System.out.println("\nEntre com sua média: ");
			media[x] = leia.nextFloat();
			
			somaMedia += media[x];
		}
			mediaGeral = somaMedia/4;
			System.out.printf("\nA média geral é: %2.2f", mediaGeral);
	}
			
}
