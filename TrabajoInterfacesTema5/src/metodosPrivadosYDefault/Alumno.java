package metodosPrivadosYDefault;

import java.util.List;
public class Alumno extends Persona implements IEstudios, IColegio{
	
	private List<Persona> listaAlumnos;

	

	public Alumno(String nombre, String apellidos, int edad, String dni, List<Persona> listaAlumnos) {
		super(nombre, apellidos, edad, dni);
		this.listaAlumnos = listaAlumnos;
	}
	

	public List<Persona> getListaAlumnos() {
		return listaAlumnos;
	}


	public void setListaAlumnos(List<Persona> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Alumno [listaAlumnos=" + listaAlumnos + "]";
	}


	@Override
	public void aniadirPersona(Persona p) {
		listaAlumnos.add(p);
		// TODO Auto-generated method stub
	}

	@Override
	public void borrarPersona(Persona p) {
		listaAlumnos.remove(p);
		// TODO Auto-generated method stub
		
	}
	
	

}
