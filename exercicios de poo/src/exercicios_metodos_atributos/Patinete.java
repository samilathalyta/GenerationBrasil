/*Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
package exercicios;

import java.text.NumberFormat;

public class Patinete {
	private String cor;
	private  String carac;
	private float preco;
	
	public Patinete (String cor, String carac, float preco) {
		this.cor = cor;
		this.carac = carac;
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCarac() {
		return carac;
	}

	public void setCarac(String carac) {
		this.carac = carac;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void imprimir() {
		System.out.println("\nCor do patine: " + cor + "\nCaracteristica: " + carac + "\nPreço: " + preco);
	}
	public String formatarNum() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //formata na moeda do pais
		nf.setMinimumFractionDigits(2); // indica a quantidade de digitos dpos da virgula
		String formatoMoeda = nf.format(preco); // formatação de saída
		return  formatoMoeda;
		
	}
}
