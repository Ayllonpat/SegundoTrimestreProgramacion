package ejercicio01;

public class Ordenador {
	
	private double capacidadDiscoDuro;
	private int frecuenciaProcesador;
	private double precioBase;
	private String marca;
	
	public Ordenador(double capacidadDiscoDuro, int frecuenciaProcesador, double precioBase, String marca) {
		super();
		this.capacidadDiscoDuro = capacidadDiscoDuro;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	public double getCapacidadDiscoDuro() {
		return capacidadDiscoDuro;
	}

	public void setCapacidadDiscoDuro(double capacidadDiscoDuro) {
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}

	public int getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(int frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDiscoDuro=" + capacidadDiscoDuro + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + ", marca=" + marca + "]";
	}
	
	public double calcularPrecioPublico() {
		double precioPublico;
		double porcentajeGanancia=15;
		int cien=100;
		
		precioPublico=precioBase+(precioBase*(porcentajeGanancia/cien));
		
		return precioPublico;
	}

}
