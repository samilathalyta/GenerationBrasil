package Exercicios_Java;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		
		int a, b, c, d, r, s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o 1 número: ");
		a = leia.nextInt();
		System.out.println("\nDigite o 2 número: ");
		b = leia.nextInt();
		System.out.println("\nDigite o 3 número: ");
		c = leia.nextInt();
		
		r = (int) Math.pow((a + b),2);
		s = (int) Math.pow((b + c),2);
		d = (r + s) / 2;
		
		System.out.println("O resultado é: " + d);
		
	}

}
