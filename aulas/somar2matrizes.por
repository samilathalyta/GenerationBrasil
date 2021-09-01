/*Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

programa
{
	
	funcao inicio()
	{
		inteiro matriz1 [3][3],
			   matriz2 [3][3],
		        matrizm1,
		        matrizm2, l=0, c=0, soma=0

		     

		para(l = 0; l <3; l++)
		{
			para( c = 0; c <3; c++) 
			{
			
				leia(matriz1[l][c])
				limpa()
			
	
			}
				
				
		
		}
			
			para(l = 0; l <3; l++)
		{
				para(c = 0; c <3; c++)
			{
				
			leia(matriz2[l][c])
			limpa()
			
				}
		
		}
		para(l = 0; l <3; l++)
		{
			para(c = 0; c <3; c++){

				
				matrizm1 = matriz1[l][c] + matriz2[l][c] 
				escreva(" ", matrizm1, "\n ")
				
				
				
			}
			
		}
		para(l = 0; l <3; l++)
		{
			para(c = 0; c <3; c++){

				
				matrizm2 = matriz1[l][c] - matriz2[l][c]
				escreva(" ", matrizm2, "\n ")
				
				 
			}
		
		
		}
	}
		
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */