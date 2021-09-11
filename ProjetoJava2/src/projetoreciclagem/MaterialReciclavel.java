package projetoreciclagem;

import java.util.Scanner;

public abstract class MaterialReciclavel {
	
	Scanner leia  = new Scanner(System.in);
	
	private int tipo;
	private String caracteristica;
	private int decomposicao;
	
	public MaterialReciclavel(int tipo, String caracteristica) 
	{
		super();
		this.setTipo(tipo);
		this.setCaracteristica(caracteristica);
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getDecomposicao() {
		return decomposicao;
	}

	public void setDecomposicao(int decomposicao) {
		this.decomposicao = decomposicao;
	}
}
