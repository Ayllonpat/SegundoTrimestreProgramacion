package metodosPrivadosYDefault;

import java.util.List;

public class Practicante extends Persona implements IEstudios, ITrabajador, IColegio{

	public Practicante(String nombre, String apellidos, int edad, String dni) {
		super(nombre, apellidos, edad, dni);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"Practicante";
	}
	
	
	public double hacerExamen(double notaRandom) {
		// TODO Auto-generated method stub
		return IEstudios.super.hacerExamen(notaRandom);
	}
	
	
	public void mostrarAprobado(double nota) {
		// TODO Auto-generated method stub
		IEstudios.super.mostrarAprobado(nota);
	}
	
	
	public int pasarLista(List<Persona> listaAlumnos) {
		// TODO Auto-generated method stub
		return ITrabajador.super.pasarLista(listaAlumnos);
	}
	
	
	public void darClase(String dni) {
		// TODO Auto-generated method stub
		ITrabajador.super.darClase(dni);
	}

}
