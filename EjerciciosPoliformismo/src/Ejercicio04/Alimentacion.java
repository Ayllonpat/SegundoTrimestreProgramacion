package Ejercicio04;

public class Alimentacion extends ProductoGenerico{
	
	private double descuento;
	private int diasParaCaducar;
	private int diasAviso;
	private double precioFinal;

	public Alimentacion(double precioUnitario, String nombreProducto, int codProducto, int codDepartamento,int cantidadAComprar,
			double descuento, int diasParaCaducar, int diasAviso) {
		super(precioUnitario, nombreProducto, codProducto, codDepartamento, cantidadAComprar, descuento);
		this.descuento = descuento;
		this.diasParaCaducar = diasParaCaducar;
		this.diasAviso = diasAviso;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}

	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}

	public int getDiasAviso() {
		return diasAviso;
	}

	public void setDiasAviso(int diasAviso) {
		this.diasAviso = diasAviso;
	}


	@Override
	public double calcularPrecio() {
		
		double precioAlterado;
		
		if(diasParaCaducar <= diasAviso) {
			precioAlterado = getPrecioUnitario() + descuento;
		}else {
			precioAlterado= getPrecioUnitario();
		}
		
		precioFinal=precioAlterado*getCantidadAComprar();
		
		return precioFinal;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"Alimentacion [precioFinal=" + precioFinal + "]";
	}

	public void mostrarAviso() {//hay que castearlo en ventas
		if(diasParaCaducar <= diasAviso) {
			System.out.printf("A este producto solo le quedan %s para caducar", diasAviso);
		}
	
	}

}
