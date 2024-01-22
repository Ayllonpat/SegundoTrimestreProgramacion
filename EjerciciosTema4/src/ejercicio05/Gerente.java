package ejercicio05;

public class Gerente extends Empleados{
	
	private double porcentajeImpuestos;

	public Gerente(String nombre, String apellidos, double sueldoBase, int nEmpleado, double porcentajeImpuestos) {
		super(nombre, apellidos, sueldoBase, nEmpleado);
		this.porcentajeImpuestos = porcentajeImpuestos;
	}

	public double getPorcentajeImpuestos() {
		return porcentajeImpuestos;
	}

	public void setPorcentajeImpuestos(double porcentajeImpuestos) {
		this.porcentajeImpuestos = porcentajeImpuestos;
	}

	@Override
	public String toString() {
		return super.toString()+"Gerente [porcentajeImpuestos=" + porcentajeImpuestos + "]";
	}
	
	public double calcularImpuestos() {
		double impuestos;
		double cien=100;
		impuestos=((porcentajeImpuestos/cien)*super.calcularSueldo());
		return impuestos;
	}
	
	public double calcularSueldo(double impuestos){
		return impuestos+super.calcularSueldo();
	}

}
