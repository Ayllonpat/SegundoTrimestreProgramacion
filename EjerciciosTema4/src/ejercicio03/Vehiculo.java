package ejercicio03;

public abstract class Vehiculo {
	
	private int categoriaContaminacion;
	private double deposito;
	private double velocidadMax;
	private double impuestoCirculacion;
	
	public Vehiculo(int categoriaContaminacion, double deposito, double velocidadMax) {
		super();
		this.categoriaContaminacion = categoriaContaminacion;
		this.deposito = deposito;
		this.velocidadMax = velocidadMax;
	}
	
	

	public Vehiculo(int categoriaContaminacion) {
		super();
		this.categoriaContaminacion = categoriaContaminacion;
	}



	public int getCategoriaContaminacion() {
		return categoriaContaminacion;
	}

	public void setCategoriaContaminacion(int categoriaContaminacion) {
		this.categoriaContaminacion = categoriaContaminacion;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	@Override
	public String toString() {
		return "Vehiculo [categoriaContaminacion=" + categoriaContaminacion + ", deposito=" + deposito
				+ ", velocidadMax=" + velocidadMax + ", cilindrada=" + ", impuestoCirculacion="
				+ impuestoCirculacion + "]";
	}
	
	public abstract double calcularFijo(); 
	
	
	public double calcularImpuesto(double fijo) {
		double cien=100;
		double veintiuno=21;
		impuestoCirculacion=fijo*(cien*veintiuno);
		
		return impuestoCirculacion;
	}

}
