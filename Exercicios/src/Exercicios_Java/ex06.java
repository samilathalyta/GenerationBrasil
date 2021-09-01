package Exercicios_Java;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
			
		float p1, p2, x2,y1, x1, y2, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite x1: ");
		x1 = leia.nextInt();
		System.out.println("Digite x2: ");
		x2 = leia.nextInt();
		System.out.println("Digite y1: ");
		y1 = leia.nextInt();
		System.out.println("Digite y2: ");
		y2 = leia.nextInt();
	
			p1 = (float) Math.pow((x2 - x1),2);
			p2 = (float) Math.pow((y2 - y1),2);
			
			 d =  (float) Math.sqrt((p1 + p2));
		
		System.out.println("\n Resultado do calculo: " + d);
		
		
		
	}
}
