programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real a, x, b, y, c, d, E, f

		escreva("\n Digite A :")
		leia(a)
		escreva("\n Digite B :")
		leia(b)
		escreva("\n Digite C :")
		leia(c)
		escreva("\n Digite D :")
		leia(d)
		escreva("\n Digite E :")
		leia(E)
		escreva("\n Digite F :")
		leia(f)

		x = c*E - b*f / a*E - b*d
		y = a*f - c*d / a*E - b*d

		escreva("\nValor de X é: ", mat.arredondar(x,2))
		escreva("\nValor de y é: ", mat.arredondar(y,2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */