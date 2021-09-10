package abstracao2;

public abstract class Animal {
	private String tipo;
		abstract public void emitirSom(int som) ;
		abstract public void deveCorrer(String correr);
		
		public Animal (String tipo) {
		this.tipo = tipo;
	}
		
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
}

