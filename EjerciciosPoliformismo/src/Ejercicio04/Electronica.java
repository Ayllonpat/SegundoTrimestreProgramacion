package Ejercicio04;

public class Electronica extends ProductoGenerico{
	
	private double impuestos;
	private double precioFinal;

	public Electronica(double precioUnitario, String nombreProducto, int codProducto, int codDepartamento, 
			double impuestos) {
		super(precioUnitario, nombreProducto, codProducto, codDepartamento, impuestos);
		this.impuestos = impuestos;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return super.toString()+"\t\t";
	}

	@Override
	public double calcularPrecio() {
		
		double precioAlterado;
		double cien = 100;
		
		precioAlterado = getPrecioUnitario() + (getPrecioUnitario()*(impuestos/cien));
		
		precioFinal=precioAlterado;
		
		return precioFinal;
	}
	
	

}
