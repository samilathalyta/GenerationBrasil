//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.


package exercicios_array;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		int num[] = new int [6];
		int contPar = 0, contImpar = 0, i, somapar = 0, somaimpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (i = 0; i < 6; i++) 
		{
			System.out.println("\nDigite um número: ");
			num[i] = leia.nextInt();
			if(num[i] % 2 == 0) {
				
				contPar++;
				somapar += num[i];
			}else {
				
				contImpar++;
				somaimpar += num[i];
			}
			
		}
		
		System.out.println("\nSoma dos números pares: " + somapar);
		System.out.println("\nSoma dos números impares: " + somaimpar);
		System.out.println("\nNumeros pares: " + contPar);
		System.out.println("\nNumeros impares: " + contImpar);
		
	}

}
