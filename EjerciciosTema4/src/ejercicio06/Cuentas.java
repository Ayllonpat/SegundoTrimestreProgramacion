package ejercicio06;

public abstract class Cuentas {

	private double saldo;
	private int tipo;
	private int idCuenta;
	
	public Cuentas(double saldo, int tipo, int idCuenta) {
		super();
		this.saldo = saldo;
		this.tipo = tipo;
		this.idCuenta = idCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	@Override
	public String toString() {
		return "Cuentas [saldo=" + saldo + ", tipo=" + tipo + ", idCuenta=" + idCuenta + "]";
	}
	
	public abstract double elegirDineroOperacion();
	
	public abstract double elegirMantenimiento();

	public abstract double ingresarDinero();
	
	public abstract double sacarDinero();
	
}
