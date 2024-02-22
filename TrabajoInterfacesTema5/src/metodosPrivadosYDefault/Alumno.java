package metodosPrivadosYDefault;

import java.util.Set;
public class Alumno extends Persona implements IEstudios, IColegio{
	
	private String clase;
	private Set<Persona> listaAlumnos;

	public Alumno(String nombre, String apellidos, int edad, String dni, String clase) {
		super(nombre, apellidos, edad, dni);
		this.clase = clase;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Alumno [clase=" + clase + "]";
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
