package metodosPrivadosYDefault;

import java.util.List;

public class Crud {
	
	private List<Persona> listaPersonasColegio;

	public Crud(List<Persona> listaPersonasColegio) {
		super();
		this.listaPersonasColegio = listaPersonasColegio;
	}

	public List<Persona> getListaPersonasColegio() {
		return listaPersonasColegio;
	}

	public void setListaPersonasColegio(List<Persona> listaPersonasColegio) {
		this.listaPersonasColegio = listaPersonasColegio;
	}

	@Override
	public String toString() {
		return "Crud [listaPersonasColegio=" + listaPersonasColegio + "]";
	}
	
	public Persona buscarEnListaPersona(String dni) {
		
		for(Persona persona: listaPersonasColegio) {
			if(persona.getDni().equalsIgnoreCase(dni)) {
				return persona;
			}
		}return null;
	}
	public Persona buscarEnListaAlumnos (String dni, List<Persona> listaAlumnos) {
		
		for(Persona persona: listaAlumnos) {
			if(persona.getDni().equalsIgnoreCase(dni)) {
				return persona;
			}
		}return null;
	}
	public Persona buscarEnListaProfesores (String dni, List<Persona> listaProfesores) {
		
		for(Persona persona: listaProfesores) {
			if(persona.getDni().equalsIgnoreCase(dni)) {
				return persona;
			}
		}return null;
	}
	public Persona buscarEnListaPracticantes (String dni, List<Persona> listaPracticantes) {
		
		for(Persona persona: listaPracticantes) {
			if(persona.getDni().equalsIgnoreCase(dni)) {
				return persona;
			}
		}return null;
	}
	public void aniadirPersona(Persona p, List<Persona> listaProfesores, List<Persona> listaPracticantes,
			List<Persona> listaAlumnos) {
		// TODO Auto-generated method stub
		listaPersonasColegio.add(p);
		if(p instanceof Alumno) { 
			listaAlumnos.add(p);
		}
		if(p instanceof Practicante) { 
			listaAlumnos.add(p);
			listaProfesores.add(p);
			listaPracticantes.add(p);
		}
		if(p instanceof Profesor) { 
			listaProfesores.add(p);
		}
	}
	
	public void borrarPersona(String dni, List<Persona> listaProfesores, List<Persona> listaPracticantes,
			List<Persona> listaAlumnos) {
		// TODO Auto-generated method stub
		Persona p=null;
		
		p=buscarEnListaPersona(dni);
		
		listaPersonasColegio.remove(buscarEnListaPersona(dni));
		
		if(p instanceof Alumno) { 
			listaAlumnos.remove(p);
		}
		if(p instanceof Practicante) { 
			listaAlumnos.remove(p);
			listaProfesores.remove(p);
			listaPracticantes.remove(p);
		}
		if(p instanceof Profesor) { 
			listaProfesores.remove(p);
		}
	}
	
	public void mostrarListaProfesores(List<Persona> listaProfesores) {
		for(Persona persona: listaProfesores) {
			System.out.println(persona);
		}
	}
	public void mostrarListaPracticantes(List<Persona> listaPracticantes) {
		for(Persona persona: listaPracticantes) {
			System.out.println(persona);
		}
	}
	
	public void mostrarListaAlumnos(List<Persona> listaAlumnos) {
		for(Persona persona: listaAlumnos) {
			System.out.println(persona);
		}
	}
	
	public void mostrarLista() {
		for(Persona persona: listaPersonasColegio) {
			System.out.println(persona);
		}
	}

	
}
