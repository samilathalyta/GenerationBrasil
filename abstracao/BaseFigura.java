package abstracao;

public class BaseFigura {
protected double lado1;
protected double lado2;
protected String nome;
protected String nomeClasse;

BaseFigura(double lado1, double lado2, String nome){
	this.lado1 = lado1;
	this.lado2 = lado2;
	this.nome = nome;
}
public double getArea() {
	//tem na interface
	return lado1 * lado2;
}
public double getPerimetro() {
	//tem na interface
	return (lado1 + lado2) * 2.0;
}
public String getNome() {
	//tem na interface
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
}
