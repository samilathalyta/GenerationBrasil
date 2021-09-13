package exCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class estoque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> dispensa = new ArrayList <String>();

try (Scanner leia = new Scanner(System.in)) {
	//adiconando
			 dispensa.add("arroz");	
			 dispensa.add("feijao");
			 dispensa.add("bombril");
			 dispensa.add("macarrao");
			 System.out.println(dispensa);
			 
			 //removendo
			 dispensa.remove(0);
			 System.out.println(" ");
			 System.out.println(dispensa);
			 
			 //ordenando
			 Collections.sort(dispensa);
			 System.out.println(" ");
			 System.out.println(dispensa);
			 
			 
			//Atualizando
			 System.out.println("\nDigite uma fruta para atualizar: ");
			 String atualizar = leia.nextLine();
			 
			 System.out.println("\nDigite a fruta que vai ser trocada por " + atualizar);
			 String novaFruta = leia.nextLine();
			 if(dispensa.contains(atualizar)) {
				 dispensa.remove(atualizar);
				 dispensa.add(novaFruta);
				 System.out.println(dispensa);
			 } else {
				 System.out.println("\nProduto não reconhecido!");
			 }
}
		 
		
	
		
	}

}
