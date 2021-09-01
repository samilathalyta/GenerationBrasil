package Laço_condicional;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, c ,b;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();
		System.out.println("Digite o trceiro número: ");
		c = leia.nextInt();
		
		if(a > b && a > c) {
			System.out.print("Maior número é: " + a);
		}else if (b > a && b > c) {
			System.out.println("Maior número é: " + b);
		}
		else {
			System.out.println("Maior número é: " + c);
		}
		
	}

}
