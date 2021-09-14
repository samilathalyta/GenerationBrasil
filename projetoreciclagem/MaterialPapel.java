package projetoreciclagem;

public class MaterialPapel extends MaterialReciclavel implements Reciclagem {
	
	private String jornal;
	private String revista;
	private String livro;
	private String embalagem;
	
	public MaterialPapel(String tipo, String caracteristica)
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
		int estado;
		System.out.println("Qual o estado do papel que deseja descartar? \n1 - Limpo \n2 - Sujo \n3 - Contaminado biologicamente e/ou quimicamente?");
		estado = leia.nextInt();
		
		if (estado == 1) 
		{
			System.out.println("Descarte em uma sacola separada e leve-o para um centro de reciclagem");
		}
		if (estado == 2) 
		{
			System.out.println("Verifique se a sujeira não está contaminada biologicamente ou quimicamente, se não estiver, descarte no lixo orgânico");
		}
		if (estado == 3) 
		{
			System.out.println("Separe-o em uma embalagem somente para esse tipo de papel e descarte-o no lixo");
		}
			
		}
	
	}
	
	@Override
	public void danoAmbiente() 
	{
		System.out.println("\n========== Dano Ambiental causado pelo papel ===========\n\n\n"
														+ "- A fabricação de papel é um dos processos mais poluentes que existem! == \n\n "
				                                        + " - O papel demora de 3 a 6 meses para se decompor.\n\n "
				                                        + "- O descarte equivocado do papel é responsável por gerar consequências como alagamentos e enchentes, sobretudo nas grandes cidades.");
		
	}
	
	@Override
	public void reutilizar() 
	{
		
		
	}	
	
}
