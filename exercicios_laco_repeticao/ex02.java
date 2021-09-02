package exercicios_laco_repeticao;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, i, contPar = 0, contImpar = 0;
		Scanner leia = new Scanner(System.in);
		
		
		
		for(i=0; i<=4; i++) 
		{
			System.out.println("\nDigite um número: ");
			n = leia.nextInt();
			
			if(n % 2 == 0) {
				contPar += n;
				
			}
			if(n % 2 != 0) {
				contImpar += n;
		}
		
		
		
	}	System.out.println("\nNúmero de pares" + contPar);
	System.out.println("\nNúmero de ímpar" + contImpar);
	}
}
