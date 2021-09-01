programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real a, b, c, r, s, d

		escreva("\nDigite número 1: ")
		leia(a)
		escreva("\nDigite número 2: ")
		leia(b)
		escreva("\nDigite número 3: ")
		leia(c)

		r = mat.potencia((a + b),2.0)
		s = mat.potencia((b + c),2.0)

		d = (s + r)/2

		escreva("\nO valor da expressão é :", mat.arredondar(d,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 96; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */