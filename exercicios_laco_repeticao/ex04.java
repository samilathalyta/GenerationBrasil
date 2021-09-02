//Uma empresa desenvolveu uma pesquisa para saber as características
//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre: (WHILE)

package exercicios_laco_repeticao;

import java.util.Scanner;

public class ex04 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,genero,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,x=1;
		
		Scanner ler = new Scanner (System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = ler.nextInt();//-8
			while(idade<1 || idade>130)
			{
				System.out.println("\nEntre com uma nova idade: ");
				idade = ler.nextInt();// 150 77
			}
			System.out.println("\nEntre com o seu genero:\n1- Feminino\n2- Masculino\n3- Outros ");
			genero = ler.nextInt();
			while(genero<1 || genero>3)
			{
				System.out.println("\nEntre com um novo genero:\n1- Feminino\n2- Masculino\n3- Outros ");
				genero = ler.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicológico:\n1- Calme\n2- Nervose\n3- Agressive ");
			fp = ler.nextInt();
			while(fp<1 || fp>3)
			{
				System.out.println("\nEntre com o seu novo fator psicológico:\n1- Calme\n2- Nervose\n3- Agressive ");
				fp = ler.nextInt();
			}
			
			if(fp==1)
			{
				contpc++;
			}
			if(genero==1 && fp == 2)
			{
				contmn++;
			}
			if(genero == 2 && fp == 3)
			{
				contha++;
			}
			if(genero == 3 && fp == 1)
			{
				contoc++;
			}
			if(fp == 2 && idade>40)
			{
				contpn40++;
			}
			if(fp == 1 && idade<18)
			{
				contpc18++;
			}
			x++;
		}
		System.out.println("\nQuantidade de pessoas calmas: "+contpc);
		System.out.println("\nQuantidade de mulheres nervosas: "+contmn);
		System.out.println("\nQuantidade de homens agressivos: "+contha);
		System.out.println("\nQuantidade de outros calmos: "+contoc);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: "+contpc18);
	}

}


