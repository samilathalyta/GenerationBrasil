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
		
		System.out.println("\nDescarte da maneira correta. \nComo está a situação do seu papel?  \n1 - Limpo \n2 - Sujo \n3 - Contaminado biologicamente e/ou"
				+ " quimicamente \n4 - Sair");
		System.out.println("\nDigite sua opção: ");
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
			System.out.println("\nVerifique se a sujeira não está contaminada biologicamente ou quimicamente, se não estiver, descarte no lixo orgânico\n");
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
														+ "- Ao reciclar, evitamos a geração de resíduos de papel \n"
				                                        + " - Reduzo consumo de água .\n\n "
				                                        + "- O descarte equivocado do papel é responsável por gerar consequências como alagamentos e enchentes, sobretudo nas grandes cidades.");
	}
	
	@Override
	public void reutilizar() 
	{
		
		if(getTipo() == 2 || getTipo() == 3) {
			System.out.println("\nDevido as condições do papel, ele não poderá ser reutilizável. Siga as instruções para um descarte correto.");
		}else {
			System.out.println("O papel pode ser utilizado! (revistas, folhas de caderno, cartões....)");
		}
		
	}	
	
}
