programa
{
	
	funcao inicio()
	{
		real altura, base, area

		escreva("\nQual a base do triangulo? ")
		leia(base)
		escreva("\nQual a altura do triangulo? ")
		leia(altura)

	area = (base * altura) / 2
		
		se(altura > 0 e base > 0){
			escreva("\n A area do trianguo é: ", area)
	}senao {
		escreva("Erro ao calcular area")
	}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */