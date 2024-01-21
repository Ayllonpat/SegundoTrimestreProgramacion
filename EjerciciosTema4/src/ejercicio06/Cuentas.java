package ejercicio06;

public abstract class Cuentas {

	private double saldo;
	private int tipo;
	
	public Cuentas(double saldo, int tipo) {
		super();
		this.saldo = saldo;
		this.tipo = tipo;
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

	@Override
	public String toString() {
		return "Cuentas [saldo=" + saldo + ", tipo=" + tipo + "]";
	}
	
	public abstract double ingresarDinero();
	
	public abstract double sacarDinero();
	
}
