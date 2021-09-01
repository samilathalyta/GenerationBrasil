package Laço_condicional;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade > 10 && idade <= 14)
		{
			System.out.println("\nInfantil");
		}
		else if (idade > 14 && idade <= 17) {
			System.out.println("\nJuvenil");
		}
		else if (idade >17 && idade <= 25) {
			System.out.println("\nAdulto");
		}
		else {
			System.out.println("\nIdade fora das categorias!");
		}
	}

}
