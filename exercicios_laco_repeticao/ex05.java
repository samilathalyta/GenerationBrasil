//Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)

package exercicios_laco_repeticao;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do 
		{
			System.out.println("\nDigite aqui os n�meros: ");
			n = leia.nextInt();
			 soma += n;
		}
		while(n != 0);
			System.out.printf("\nA soma dos n�meros digitados, �: " + soma);
	}
}
