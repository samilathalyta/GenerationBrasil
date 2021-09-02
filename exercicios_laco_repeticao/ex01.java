//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.
package exercicios_laco_repeticao;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1000; x <1999; x++) {
			if(x % 11 == 5) {
				System.out.println(x);
			}
		}
	}

}
