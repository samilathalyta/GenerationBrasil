programa
{
	
	funcao inicio()
	{
	
	//ATIVIDADE 3
		inteiro tseg, h, m, s, resto

		escreva("\nQantidade de segudos: ")
		leia(tseg)

	h = tseg / 3600
	resto = tseg % 3600
	m = resto / 60
	s = resto % 60
	

	escreva("\n Horas: ", h, "\nMinutos: ", m , "\nSegundos: ", s)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */