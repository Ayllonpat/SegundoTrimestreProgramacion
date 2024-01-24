package ejercicio06;

public class CuentaEmpresa extends Cuentas{
	
	private double dineroOperacion;

	public CuentaEmpresa(double saldo, int tipo, int idCuenta) {
		super(saldo, tipo, idCuenta);
		// TODO Auto-generated constructor stub
	}

	public double getDineroOperacion() {
		return dineroOperacion;
	}

	public void setDineroOperacion(double dineroOperacion) {
		this.dineroOperacion = dineroOperacion;
	}

	@Override
	public String toString() {
		return super.toString()+" CuentaEmpresa";
	}

	@Override
	public double elegirDineroOperacion() {
		// TODO Auto-generated method stub
		dineroOperacion=2000;
		return dineroOperacion;
	}

	@Override
	public double elegirMantenimiento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ingresarDinero() {
		// TODO Auto-generated method stub
		super.setSaldo( getSaldo()+dineroOperacion);
		return getSaldo();
	}

	@Override
	public double sacarDinero() {
		// TODO Auto-generated method stub
		double uno=1;
		super.setSaldo( getSaldo()-dineroOperacion-uno);
		return getSaldo();
	}

	@Override
	public double calcularSaldoMantenimiento() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
