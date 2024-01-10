package ejercicio01;

public class Portatil extends Ordenador{
	
	private boolean seguro;
	private double precioSeguro;
	
	public Portatil(double capacidadDiscoDuro, int frecuenciaProcesador, double precioBase, String marca,
			boolean seguro, double precioSeguro) {
		super(capacidadDiscoDuro, frecuenciaProcesador, precioBase, marca);
		this.seguro = seguro;
		this.precioSeguro = precioSeguro;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return super.toString() + "Portatil [seguro=" + seguro + ", precioSeguro=" + precioSeguro + "]";
	}
	
	public double calcularPrecioPublico() {
		double precioPublico;
		if(seguro=true) {
			precioPublico=super.calcularPrecioPublico()+precioSeguro;
			}
		else {
			precioPublico=super.calcularPrecioPublico();
		}
		return precioPublico;
	}
	
	

}
