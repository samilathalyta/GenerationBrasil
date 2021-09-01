
package Exercicios_Java;

import java.util.Scanner;

public class Sequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos, meses, dias, idadedias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("\nDigite meses: ");
		meses = leia.nextInt();
		System.out.println("\nDigite em dias");
		dias = leia.nextInt();
		
		idadedias = (anos*365) + (meses*30) + dias;
		
		System.out.printf("\n A sua idade em dias é:  " + idadedias);
		
		
	}

}
