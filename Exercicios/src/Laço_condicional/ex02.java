package Laço_condicional;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, primeiro = 0, segundo=0, terceiro=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();
		System.out.println("Digite o trceiro número: ");
		c = leia.nextInt();
		
		
		if(a < b && a < c)
		{
			if(b < c) {
				 System.out.println("Ordem crescente: " + a + b + c);
			}
		}
			else if (a < c && b < c) {
				if (a < c) {
				System.out.println("Ordem crescentee: " + a + c + b);
			 }
			else if (c < a && c < b){
				if (c < b) {
				System.out.println("Ordem crescente: " + c + a + b);
			}else{
				System.out.println("Ordem crescente: " + c + a + a);
			}
			}
			
			}
		
	}



	
}
