package exercicios;

public class produtoEletronico {
	private String marca, cor;
	private int qtdMemoria;
	
	public produtoEletronico(String marca, String cor,  int qtdMemoria) {
		this.marca = marca;
		this.cor = cor;
		this.qtdMemoria = qtdMemoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdMemoria() {
		return qtdMemoria;
	}

	public void setQtdMemoria(int qtdMemoria) {
		this.qtdMemoria = qtdMemoria;
	}
public void imprimir() {
	System.out.println("Celular da marca: " + marca + "\nCor: " + cor + "\nMemória: " + qtdMemoria);
}
}
