package Exercicios_Java;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		
		int a, b, c, d, r, s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o 1 n�mero: ");
		a = leia.nextInt();
		System.out.println("\nDigite o 2 n�mero: ");
		b = leia.nextInt();
		System.out.println("\nDigite o 3 n�mero: ");
		c = leia.nextInt();
		
		r = (int) Math.pow((a + b),2);
		s = (int) Math.pow((b + c),2);
		d = (r + s) / 2;
		
		System.out.println("O resultado �: " + d);
		
	}

}
