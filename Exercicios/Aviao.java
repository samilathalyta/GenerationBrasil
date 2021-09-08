/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
*esta classe, em seguida crie um objeto avi�o, defina as instancias deste
*objeto e apresente as informa��es deste objeto no console.
*/

package exercicios;

public class Aviao {
	private int qtdPassageiros;
	private int qtdPoltronas;
	private String marcaAviao;
	
	public Aviao(int qtdPassageiros, int qtdPoltronas, String marcaAviao) {
		this.qtdPassageiros = qtdPassageiros;
		this.qtdPoltronas = qtdPoltronas;
		this.marcaAviao = marcaAviao;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
			
	}

	public int getQtdPoltronas() {
		return qtdPoltronas;
	}

	public void setQtdPoltronas(int qtdPoltronas) {
		this.qtdPoltronas = qtdPoltronas;
		
		
	}
	public void imprimir() {
		System.out.println("\n- Avi�o da companhia: " +marcaAviao + "\n- Quantidade de passageiro � de: " + qtdPassageiros + "\n- N�mero de poltronas � de : " + qtdPoltronas + "\n");
	}

	public String getMarcaAviao() {
		return marcaAviao;
	}

	public void setMarcaAviao(String marcaAviao) {
		this.marcaAviao = marcaAviao;
	}
	

	
}
