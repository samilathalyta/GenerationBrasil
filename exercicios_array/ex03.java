//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package exercicios_array;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		int linha = 3, coluna = 3, soma = 0, cont10 = 0;
		int num [][] = new int [linha][coluna];
		
		Scanner leia = new Scanner (System.in);
		
		for(int l = 0; l < linha; l++) 
		{
			for(int c = 0; c < coluna; c++) 
			{
				System.out.println("\nDigite número: ");
				num[l][c] = leia.nextInt();
				
				
			}
		}	
		for(int l = 0; l < linha; l++) 
		{
			for(int c = 0; c < coluna; c++) 
			{
				if(num[l][c] > 10) 
				{
					
					cont10++;
					
					
				}
			}
		} 
		
		System.out.println("\n" + cont10 + " números maiores que 10");
	}
}
