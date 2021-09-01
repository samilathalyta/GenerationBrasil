package Exercicios_Java;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, media, mediap;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a 1 nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a 1 nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a 1 nota: ");
		nota3 = leia.nextFloat();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		mediap = media/10;
		
		System.out.println("A média ponderada é: " + media);
	}

}
