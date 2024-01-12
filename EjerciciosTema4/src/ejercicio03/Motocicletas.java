package ejercicio03;

public class Motocicletas extends Vehiculo{
	
	private double cilindrada;

	public Motocicletas(int categoriaContaminacion, double deposito, double velocidadMax,
			double cilindrada) {
		super(categoriaContaminacion, deposito, velocidadMax);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return super.toString() + "Motocicletas [cilindrada=" + cilindrada + "]";
	}
	
	public double calcularFijo() {
		double fijo;
		int cien=100;
		int porcentaje=60;
		fijo=cien*(cilindrada*porcentaje);
		return fijo;
		
	}
	
	

}
