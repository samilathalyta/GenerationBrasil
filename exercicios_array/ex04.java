//4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
//(1) somar as duas matrizes 
//(2) subtrair a primeira matriz da segunda 
//(3) adicionar uma constante as duas matrizes (adicionar uma matriz)
//(4) imprimir as matrizes 


package exercicios_array;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] matriz1 = new float [2][2];
		float matriz2 [][] = new float [2][2];
		float[][] somaMatriz = new float [2][2];
		float[][] subMatriz = new float [2][2];
		int op = 0, constante;
		
		Scanner leia = new Scanner (System.in);
		
		for(int l=0; l<2; l++) 
		{
			for(int c=0; c<2; c++) 
			{
				System.out.println("\nDigite um número na posição: ["+ l + "  " + c + "]");
				matriz1[l][c] = leia.nextFloat();
				
			}
		}
		
		for(int l=0; l<2; l++) 
		{
			for(int c=0; c<2; c++) 
			{
				System.out.println("\nDigite um número na posição: [" + l +  "  "  +  c + " ]");
				matriz2[l][c] = leia.nextFloat();
			}
		}
		
			
		
		System.out.println("\n===== Escolha uma opção: =====");
		System.out.println("\n(1) somar as duas matrizes");
		System.out.println("\n(2) subtrair a primeira matriz da segunda");
		System.out.println("\n(3) adicionar uma constante as duas matrizes (adicionar uma matriz)");
		System.out.println("\n(4) imprimir as matrizes");
		System.out.println("\n(5) Sair");
		
		System.out.println("Digite uma opção: ");
		op = leia.nextInt();
		
		
		switch(op) {
		case 1: 
			for(int l=0; l<2; l++) 
			{
				for(int c=0; c<2; c++) 
				{
					somaMatriz[l][c] =  matriz1[l][c] + matriz2[l][c];
					System.out.println("\n soma da matriz: " + somaMatriz[l][c]);
					
				}
			}
			break;
		case 2: 
			for(int l=0; l<2; l++) 
			{
				for(int c=0; c<2; c++) 
				{
					subMatriz[l][c] =  matriz1[l][c] - matriz2[l][c];
					System.out.println("\n soma da matriz: " + subMatriz[l][c]);
					
				}
			}
			break;
		case 3:
			System.out.println("Digite uma numero: ");
			constante = leia.nextInt();
			for(int l=0; l<2; l++) 
			{
				for(int c=0; c<2; c++) 
				{
			 matriz1[l][c] += constante;
			 matriz2[l][c] += constante;
			 
			System.out.println("\n Matriz1 " + matriz1[l][c]);
			System.out.println("\n Matriz2 " + matriz2[l][c]);
				}
			}
			break;
		case 4:
			for(int l=0; l<2; l++) 
			{
				for(int c=0; c<2; c++) 
				{
					System.out.println("\n " + matriz1[l][c]);
					
				}
			}
			for(int l=0; l<2; l++) 
			{
				for(int c=0; c<2; c++) 
				{
					System.out.println("\n " + matriz2[l][c]);
				}
			}
				break;
				default:
					System.out.println("\nObrigada por utilizar nosso sistema! =)");	
		
		}		
	}
		
	
	
		
}

