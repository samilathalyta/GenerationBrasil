//1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
//(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
//(d) Mostre na tela cada valor do vetor A, um em cada linha.

 
package exercicios_array;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 0 , 5, -2, -5, 7};
		int soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for (int i : a) 
		{
			System.out.println("\n Vetor: " + i);		
		}
		
		for (int i=0; i<7; i ++) 
		{
			soma = a[0] + a[1] + a[4];
			System.out.println("\nsoma é :" + soma);
		}
		
		
		for(int i=0; i<7; i ++) 
		{
			a[4] = 100;
			
			
		}
		
		System.out.println("\nValor da posição 4 é: " + a[4]);
		for (int i : a) 
		{
			System.out.println("\n Vetor: " + i);		
		}
	
}
	
	
	
	
}
