//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)

package exercicios_laco_repeticao;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, cont = 0, soma=0, media=0;
		Scanner leia = new Scanner (System.in);
		
		do 
		{
			System.out.println("\n Digite os n�meros: ");
			n = leia.nextInt();
		 if(n %3==0 && n!=0) {
			 soma += n;
			 cont++;
			
		 }	
			 
		}
		while(n != 0);
		System.out.println("\\n Digite um numero inteiro:");
		media = soma/cont;
		
		if(n %3==0 && n!=0)
		 {
		 soma+=n;
		 cont++;
		 }
		 media=soma/cont;
		 
		
		
		System.out.println("\n A m�dia dos n�mero � de: " + media);
		

	}

}
