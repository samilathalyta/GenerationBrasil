package Laço_condicional;

import java.util.Scanner;

public class ex04 {
		public static void main(String[] args) {
			
			double a, raizq, potencia;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite um número: ");
			a = leia.nextInt();
			
			if (a % 2 == 0){
				raizq = Math.pow(a, 2);
				System.out.println("\nO número " + a + " é par!" + "\nResultado da raiz²: " + raizq);
			}else if (a % 2 != 0) {
				potencia = Math.sqrt(a);
				System.out.println("\nO número " + a + " é ímpar!" + "\nResultado da potencia: " + potencia);
			}
			
			
			
	
}
}
