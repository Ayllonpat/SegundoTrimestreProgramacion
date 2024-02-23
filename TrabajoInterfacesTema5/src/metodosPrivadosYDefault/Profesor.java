package metodosPrivadosYDefault;

import java.util.List;

public class Profesor extends Persona implements ITrabajador, IColegio{

	public Profesor(String nombre, String apellidos, int edad, String dni) {
		super(nombre, apellidos, edad, dni);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString()+"Profesor";
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
