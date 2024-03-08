package lambda1;

public class Vehiculo {
	
	private double kmRecorridos;
	
	public Vehiculo(double kmRecorridos) {
		super();
		this.kmRecorridos = kmRecorridos;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	@Override
	public String toString() {
		return "Vehiculo [kmRecorridos=" + kmRecorridos + "]";
	}

	

}
