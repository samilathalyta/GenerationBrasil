programa
{
	
	funcao inicio()
	{ 
	real idade
	
		escreva("Qual sua idade: ")
		leia(idade)

	se(idade >= 5 e idade < 7){
		escreva("\nInfantil A = 5 a 7 anos \n")
	}senao se (idade >=8 e idade< 11){
		escreva("\nInfantil B = 8 a 11 anos \n")
	}senao se (idade >= 12 e idade <=13){
		escreva("Juvenil A = 12 a 13 anos \n")
	}senao se (idade >= 14 e idade < 17){
		escreva("Juvenil B = 14 a 17 anos \n")
	}senao{
		escreva("Maior de 18 anos\n ")
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */