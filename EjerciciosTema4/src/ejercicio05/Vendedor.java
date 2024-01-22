package ejercicio05;

public class Vendedor extends Empleados{
	
	private int cantidadVentas;
	private double porcentajeIcentivo;
	private double totalVendido;
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int nEmpleado, int cantidadVentas,
			double porcentajeIcentivo, double totalVendido) {
		super(nombre, apellidos, sueldoBase, nEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.porcentajeIcentivo = porcentajeIcentivo;
		this.totalVendido = totalVendido;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getPorcentajeIcentivo() {
		return porcentajeIcentivo;
	}

	public void setPorcentajeIcentivo(double porcentajeIcentivo) {
		this.porcentajeIcentivo = porcentajeIcentivo;
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}

	@Override
	public String toString() {
		return super.toString()+ "Vendedor [cantidadVentas=" + cantidadVentas + ", porcentajeIcentivo=" + porcentajeIcentivo
				+ ", totalVendido=" + totalVendido + ", sueldoFinal="+ calcularSueldo()+"]" ;
	}
	
	public double calcularIcentivo() {
		double totalPorcentaje;
		double cien=100;
		
		totalPorcentaje=((porcentajeIcentivo/100)*totalVendido);
		
		return totalPorcentaje;
	}
	
	public double calcularSueldo(double totalPorcentaje) {
		return super.calcularSueldo()+totalPorcentaje;
	}
	
	public void mostraFelicitacion() {
		int objetivoVentas=10;
		if (cantidadVentas > objetivoVentas) {
			System.out.println("FELICIDADES, HA SUPERADO EL OBJETIVO DE VENTAS");
		}
		
	}
	
}
