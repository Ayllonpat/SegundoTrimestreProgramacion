package ejemplo1Herencia;

public class Empleado extends Trabajador {
	
	
	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, String dni, double sueldo, double impuestos) {
		super(nombre, puesto, dni);//es una llamada al constructor de la clase madre (trabajador)
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}
	
}
