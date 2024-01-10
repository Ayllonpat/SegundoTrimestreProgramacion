package ejercicio01;

public class Sobremesa extends Ordenador{
	
	private double precioMontaje;

	public Sobremesa(double capacidadDiscoDuro, int frecuenciaProcesador, double precioBase, String marca,
			double precioMontaje) {
		super(capacidadDiscoDuro, frecuenciaProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return super.toString() + "Sobremesa [precioMontaje=" + precioMontaje + "]";
	}
	
	public double calcularPrecioPublico() {
		double precioPublico;
		precioPublico=super.calcularPrecioPublico()+precioMontaje;
		return precioPublico;
	}
	
	

}
