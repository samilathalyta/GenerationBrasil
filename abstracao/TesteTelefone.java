package abstracao;
		
public class TesteTelefone {
	
	public static void main(String[] args) {
Celular celular = new Celular();
Fixo fixo = new Fixo();
Publico publico = new Publico();
Telefone telefone = null;

	int n = (int) (Math.random()*3.0);
	System.out.println("\nO numero escolhido foi:: " + n);
	
switch(n) {
	case 1: telefone = celular; break;
	case 2: telefone = fixo;break;
	case 3: telefone = publico; break;
	default: System.out.println("\nErrro inesperado!");

}
	if(telefone != null) {
		telefone.disca("25664267");
		telefone.toca(5);
	}

}
}
