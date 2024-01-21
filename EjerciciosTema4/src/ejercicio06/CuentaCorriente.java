package ejercicio06;

public class CuentaCorriente extends Cuentas{

	private double mantenimientoFijo;
	
	private int puntosTotales;

	public CuentaCorriente(double saldo, int tipo, double mantenimientoFijo, int puntosTotales) {
		super(saldo, tipo);
		this.mantenimientoFijo = mantenimientoFijo;
		this.puntosTotales = puntosTotales;
	}

	public double getMantenimientoFijo() {
		return mantenimientoFijo;
	}

	public void setMantenimientoFijo(double mantenimientoFijo) {
		this.mantenimientoFijo = mantenimientoFijo;
	}

	public int getPuntosTotales() {
		return puntosTotales;
	}

	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [mantenimientoFijo=" + mantenimientoFijo + ", puntosTotales=" + puntosTotales + "]";
	}

	@Override
	public double ingresarDinero() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sacarDinero() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
