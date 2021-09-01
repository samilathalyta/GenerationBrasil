programa
{
	
	funcao inicio()
	{
		real c, n = 10.0, E = 20.0 
		
		
		

		escreva("\nDigite o código: ")
		leia(c)
		escreva("Digite quantidade de horas trabalhadas: ")
		leia(n)

	
	E = (n - 50) * E

		 se (n <= 50){
		 	
		 	escreva("\nSeu salário total é de: ", n * 10, " sem horas excedentes\n")
		 }senao{
		 	escreva("\nsalário excedeu mais de 50H. Valor excedente: ",  E)
		 }
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 187; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */