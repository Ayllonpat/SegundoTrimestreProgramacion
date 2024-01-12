package ejercicio03;

public class Furgonetas extends Vehiculo{
	
	private double fijoMercancia;

	public Furgonetas(int categoriaContaminacion, double deposito, double velocidadMax, 
			double fijoMercancia) {
		super(categoriaContaminacion, deposito, velocidadMax);
		this.fijoMercancia = fijoMercancia;
	}

	public double getFijoMercancia() {
		return fijoMercancia;
	}

	public void setFijoMercancia(double fijoMercancia) {
		this.fijoMercancia = fijoMercancia;
	}

	@Override
	public String toString() {
		return super.toString() + "Furgonetas [fijoMercancia=" + fijoMercancia + "]";
	}
	
	public double calcularFijo() {
		double fijo;
		fijo=fijoMercancia;
		return fijo; 		
	}
	

}
