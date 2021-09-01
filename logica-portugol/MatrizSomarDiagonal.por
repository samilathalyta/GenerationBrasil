/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], l, c, soma=0, somaD=0, linha=0, coluna=02
		

		para(l=0; l<3; l++)
		{
			para(c=0; c<3; c++)
			{
				leia(matriz[l][c])
				soma += matriz[l][c]
			
			}
			
		}
		
		
		para(l=0; l<3; l++)
		{
			para(c=0; c<3; c++)
			{
				se( l == c) //e a (L) for igual a (C)
				{
					escreva("\nA soma daigonal é: ", matriz[l][c])
					
					somaD += (matriz[l][c])
				}
			} 
			
		}
			escreva("\nA soma é: ", soma)
			escreva("\nA soma Diagonal: ", somaD)
			
			
					
			
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 10, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */