/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

programa
{
	
	
	funcao inicio()
	{
		inteiro  mediafilhos=0, filhos, i, np=1, somaf=0
		real maiorsal=0.0, msal=0.0, perce=0.0, somasal=0.0, sal, cont100=0.0

para (np = 1; np <=5; np++){ 
		escreva("\nDigite o salario: ")
		leia(sal)
		escreva("Quantidad de filhos: ")
		leia(filhos)
		somasal += sal
		msal = somasal/np
		somaf += filhos
		mediafilhos = somaf/np
		perce = (cont100 * 100) / 4
		
		

		se(maiorsal < sal){
			maiorsal = sal
		}se (sal <= 100){
			cont100++
		}
		
		}
		
		escreva("\nA media salarial é de: ", msal)
		escreva("\nA média de filhos é de: ", mediafilhos)
		escreva("\nMaior salario: ", maiorsal)
		escreva("\nPercentual de sal 100: ", perce)
		
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */