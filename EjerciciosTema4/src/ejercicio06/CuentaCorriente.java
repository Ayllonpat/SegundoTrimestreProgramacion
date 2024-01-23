package ejercicio06;

public class CuentaCorriente extends Cuentas{

	private double mantenimientoFijo;
	
	private int puntosTotales;
	
	private double dineroOperacion;

	public CuentaCorriente(double saldo, int tipo, int idCuenta, int puntosTotales) {
		super(saldo, tipo, idCuenta);
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

	public double getDineroOperacion() {
		return dineroOperacion;
	}

	public void setDineroOperacion(double dineroOperacion) {
		this.dineroOperacion = dineroOperacion;
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaCorriente [mantenimientoFijo=" + mantenimientoFijo + ", puntosTotales=" + puntosTotales + "]";
	}
	
	public double elegirDineroOperacion() {
		
		dineroOperacion=250;
		
		return dineroOperacion;
	}
	
	public double elegirMantenimiento() {
		
		mantenimientoFijo=200;
		
		return mantenimientoFijo;
	}
	
	public double calcularSaldoMantenimiento() {
		return getSaldo()-mantenimientoFijo;
	}

	@Override
	public double ingresarDinero() {
		sumarPuntos();
		return calcularSaldoMantenimiento()+dineroOperacion;
	}

	@Override
	public double sacarDinero() {
		// TODO Auto-generated method stub
		sumarPuntos();
		return calcularSaldoMantenimiento()-dineroOperacion;
	}
	
	public double sumarPuntos() {
		puntosTotales++;
		return puntosTotales;
	}
	
}
