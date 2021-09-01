programa
{
	
	funcao inicio()
	{
		real p, E, m

		escreva("\nQual o peso? ")
		leia(p)
		
		E = p - 50
		m = E * 4

		se(p > 50){
			escreva("\nSua multa será no valor de: ", m)
		
		}senao{
			escreva("\n Peso de ", p , " está dentro do regulamento!\n Valor da multa: ", m)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */