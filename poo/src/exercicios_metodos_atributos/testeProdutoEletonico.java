package exercicios;

public class testeProdutoEletonico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		produtoEletronico produto = new produtoEletronico("Iphone", "rose", 64);
		
		produto.imprimir();
		System.out.println("==== celular 2 ========");
		
		produtoEletronico produto2= new produtoEletronico("Samnsung", "preto", 16);
		produto2.imprimir();
		
	}

}
