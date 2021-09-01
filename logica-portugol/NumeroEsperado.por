programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4
		//q1, q2, q3, q4

		escreva("\nDigite número 1: ")
		leia(n1)
		escreva("\nDigite número 2: ")
		leia(n2)
		escreva("\nDigite número 3: ")
		leia(n3)
		escreva("\nDigite número 4: ")
		leia(n4)

		n1 = mat.potencia(n1,2.0)
		
		n2 = mat.potencia(n2,2.0)
		
		n3 = mat.potencia(n3,2.0)
		
		n4 = mat.potencia(n4,2.0)
		

		se(n3 >= 1000){
			
			escreva("\n O resultado de N3 é6: ", n3, "\nfim")
			
			} senao {
				
				escreva("\n O resultado de N1 é: ", n1)
				escreva("\n O resultado de N2 é: ", n2)
				escreva("\n O resultado de N3 é: ", n3)
				escreva("\n O resultado de N4 é: ", n4 )

			}
			
				
			
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */