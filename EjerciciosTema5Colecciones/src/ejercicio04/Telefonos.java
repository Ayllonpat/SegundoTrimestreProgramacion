package ejercicio04;

public class Telefonos {
	
	int numero;

	public Telefonos(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefonos [numero=" + numero + "]";
	}
	
	
	
}
