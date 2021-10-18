package exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] func = new Funcionario [3];
			func[0] = new Funcionario	(123456, "Fulano da Silva", "Dev Java");
			func[1] = new Funcionario	(321654, "Zé da Zuzu", "Atendente");
			func[2] = new Funcionario	(987654, "Manezinho", "Adm Banco de dados");
		
			for(Funcionario roda:func) {
				roda.imprimir();
			}
	}

}
