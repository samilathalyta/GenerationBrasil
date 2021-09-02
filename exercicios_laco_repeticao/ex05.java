//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
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
			System.out.println("\nDigite aqui os números: ");
			n = leia.nextInt();
			 soma += n;
		}
		while(n != 0);
			System.out.printf("\nA soma dos números digitados, é: " + soma);
	}
}
