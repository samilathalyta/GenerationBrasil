package projetoreciclagem;

public class MaterialPapel extends MaterialReciclavel implements Reciclagem {
	
	private String jornal;
	private String revista;
	private String livro;
	private String embalagem;
	
	public MaterialPapel(int tipo, String caracteristica)
	{
		super(tipo, caracteristica);
		
	}
	
	
	public String getJornal() {
		return jornal;
	}



	public void setJornal(String jornal) {
		this.jornal = jornal;
	}



	public String getRevista() {
		return revista;
	}



	public void setRevista(String revista) {
		this.revista = revista;
	}



	public String getLivro() {
		return livro;
	}



	public void setLivro(String livro) {
		this.livro = livro;
	}



	public String getEmbalagem() {
		return embalagem;
	}



	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}



	@Override
	public void descartar() 
	{
		
		System.out.println("\nDescarte da maneira correta. \nComo est� a situa��o do seu papel?  \n1 - Limpo \n2 - Sujo \n3 - Contaminado biologicamente e/ou"
				+ " quimicamente \n4 - Sair");
		System.out.println("\nDigite sua op��o: ");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() >4)
		{
			System.out.println("Qual o estado do papel que deseja descartar? \n1 - Limpo \n2 - Sujo \n3 - Contaminado biologicamente e/ou"
					+ " quimicamente? \n4 - Sair");
			setTipo(leia.nextInt());
		}
		switch (getTipo())
		{
			case 1:
			System.out.println("\nDescarte em uma sacola separada e leve-o para um centro de reciclagem\n");
		break;
		case 2:
			System.out.println("\nVerifique se a sujeira n�o est� contaminada biologicamente ou quimicamente, se n�o estiver, descarte no lixo org�nico\n");
		break;
		case 3: 
			System.out.println("\nSepare-o em uma embalagem somente para esse tipo de papel e descarte-o no lixo\n");
		break;
		default:
			System.out.println("\nSaindo....");
		
		}
	}
	
	@Override
	public void danoAmbiente() 
	{
		System.out.println("\n========== Impacto ambiental  ===========\n\n"
														+ "- Ao reciclar, evitamos a gera��o de res�duos de papel \n"
				                                        + " - Reduzo consumo de �gua .\n\n "
				                                        + "- O descarte equivocado do papel � respons�vel por gerar consequ�ncias como alagamentos e enchentes, sobretudo nas grandes cidades.");
	}
	
	@Override
	public void reutilizar() 
	{
		
		if(getTipo() == 2 || getTipo() == 3) {
			System.out.println("\nDevido as condi��es do papel, ele n�o poder� ser reutiliz�vel. Siga as instru��es para um descarte correto.");
		}else {
			System.out.println("O papel pode ser utilizado! (revistas, folhas de caderno, cart�es....)");
		}
		
	}	
	
}
