/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. 

A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

programa
{
	
	funcao inicio()
	{
		inteiro dado [10], cont=0, maiorP=0
		real media=0.0, soma=0.0

		para (inteiro i=0; i<10; i ++)
		{

			leia(dado[i])
			limpa()
			soma += dado[i]
			media = soma/10

			se(dado[i] > maiorP)
			{
				
				maiorP = dado[i]
			}
			
		}
		para (inteiro i=0; i<10; i ++)
		{
			escreva (i, " Lançamento: ", dado[i], "\n" )
			 
		
			
			
		}
		escreva("\nSoma é: ", soma)
		escreva("\nMédia: ", media)
		escreva("\nMaior Pontuação: ",maiorP)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 13, 10, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */