//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.

package exercicios_laco_repeticao;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade=0, somaIdade21 =0, somaIdade50 =0;
		 
		
		Scanner leia = new Scanner (System.in);
		
		
		while(idade <=99) {
			System.out.println("\n Digite sua  idade: ");
			idade = leia.nextInt(); 
			
			if(idade < 22){
			 somaIdade21++;
			 
			}
			if(idade > 50 && idade <= 99) {
				 somaIdade50++;
			}
			
		}System.out.println("\n Total de pessoas com 21 anos: " + somaIdade21);
		System.out.println("\n Total de pessoas com 50 anos: " + somaIdade50);
	}

}
