package La�o_condicional;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, c ,b;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = leia.nextInt();
		System.out.println("Digite o trceiro n�mero: ");
		c = leia.nextInt();
		
		if(a > b && a > c) {
			System.out.print("Maior n�mero �: " + a);
		}else if (b > a && b > c) {
			System.out.println("Maior n�mero �: " + b);
		}
		else {
			System.out.println("Maior n�mero �: " + c);
		}
		
	}

}
