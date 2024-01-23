package ejercicio06;

public class CuentaJoven extends Cuentas{
	
	private double dineroOperacion;

	public CuentaJoven(double saldo, int tipo, int idCuenta) {
		super(saldo, tipo, idCuenta);
	}
	
	

	public double getDineroOperacion() {
		return dineroOperacion;
	}



	public void setDineroOperacion(double dineroOperacion) {
		this.dineroOperacion = dineroOperacion;
	}



	@Override
	public String toString() {
		return super.toString() + " CuentaJoven";
	}

	@Override
	public double elegirMantenimiento() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double elegirDineroOperacion() {
		// TODO Auto-generated method stub
		dineroOperacion=100;
		return dineroOperacion;
	}

	@Override
	public double ingresarDinero() {
		double uno=1;
		// TODO Auto-generated method stub
		return getSaldo()+dineroOperacion+uno;
	}

	@Override
	public double sacarDinero() {
		// TODO Auto-generated method stub
		return getSaldo()-dineroOperacion;
	}

}
