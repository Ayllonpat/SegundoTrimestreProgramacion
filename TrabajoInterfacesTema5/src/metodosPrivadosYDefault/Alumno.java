package metodosPrivadosYDefault;

public class Alumno extends Persona implements IEstudios, IColegio{

	public Alumno(String nombre, String apellidos, int edad, String dni) {
		super(nombre, apellidos, edad, dni);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString()+"Alumno";
	}
	

	public double hacerExamen(double notaRandom) {
		// TODO Auto-generated method stub
		return IEstudios.super.hacerExamen(notaRandom);
	}
	

	public void mostrarAprobado(double nota) {
		// TODO Auto-generated method stub
		IEstudios.super.mostrarAprobado(nota);
	}
}
