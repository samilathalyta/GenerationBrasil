package Exercicios_Java;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float horas, minutos, segundos, totalsegundos, resto;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nDigite as horas em segundos: ");
		totalsegundos = scanner.nextFloat();
			
				horas = totalsegundos / 3600;
				resto = totalsegundos % 3600;
				minutos = resto / 60;
				segundos = resto % 60;
				
				System.out.println("\n Horas: " + horas + "\nMinutos: " + minutos + "segundos: " + segundos);
				
		
	}

}
