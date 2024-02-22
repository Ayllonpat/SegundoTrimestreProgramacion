package metodosPrivadosYDefault;

import java.util.List;

public class Practicante extends Persona implements IEstudios, ITrabajador, IColegio{
	
	private List<Persona> listaAlumnos;
	private List<Persona> listaProfesores;
	
	public Practicante(String nombre, String apellidos, int edad, String dni) {
		super(nombre, apellidos, edad, dni);
		// TODO Auto-generated constructor stub
		
	}
	

	@Override
	public void aniadirPersona(Persona p) {
		// TODO Auto-generated method stub
		listaAlumnos.add(p);
		listaProfesores.add(p);
		
	}

	@Override
	public void borrarPersona(Persona p) {
		// TODO Auto-generated method stub
		listaAlumnos.remove(p);
		listaProfesores.remove(p);
		
	}

	

	

}
