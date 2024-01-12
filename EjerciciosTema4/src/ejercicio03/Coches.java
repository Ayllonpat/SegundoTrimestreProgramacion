package ejercicio03;

public class Coches extends Vehiculo{
	
	private double potencia;

	public Coches(int categoriaContaminacion, double deposito, double velocidadMax,
			double potencia) {
		super(categoriaContaminacion, deposito, velocidadMax);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return super.toString() + "Coches [potencia=" + potencia + "]";
	}
	
	public double calcularFijo() {
		double fijo;
		int cien=100;
		int porcentaje=25;
		fijo=cien*(potencia*porcentaje);
		return fijo;
		
	}

}
