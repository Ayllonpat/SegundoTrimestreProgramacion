package ejemplo1Herencia;

public class Empleado extends Trabajador {
	
	
	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, String dni, double sueldo, double impuestos) {
		super(nombre, puesto, dni);//es una llamada al constructor de la clase madre (trabajador)
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}
	
	//necesitamos un constructor solo del dni en trabajador
	
	public Empleado(String dni, double sueldo, double impuestos) {
		super(dni);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return super.toString()+"Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}
	
	public double calcularPaga() {
		double cien=100.0;
		return sueldo-sueldo*impuestos/cien;
	}
	
	public double calcularPagaV2(double fijo) {
		double cien = 100.0;
		double total=0.0;
		total= super.calcularPagaV2(fijo) +sueldo-sueldo*impuestos/cien;
		return total;
	}
	
}
