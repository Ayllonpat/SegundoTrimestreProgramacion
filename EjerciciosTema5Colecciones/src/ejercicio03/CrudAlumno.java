package ejercicio03;

import java.util.Iterator;
import java.util.Set;import java.util.function.Consumer;

public class CrudAlumno {
	
	private Set<Alumnos> listaAlumnos;
	
	public CrudAlumno(Set<Alumnos> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public Set<Alumnos> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Set<Alumnos> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "CrudAlumno [listaAlumnos=" + listaAlumnos + "]";
	}
	
	public Alumnos buscarAlumno(int id) {
		
		Iterator<Alumnos> it = listaAlumnos.iterator();
		Alumnos a=null;
		
		boolean encontrado=false;
		
		while (it.hasNext() && !encontrado) {
			a=it.next();
			if(a.getId()==id) {
				encontrado= true;
			}
					
		}return a;
		
	}

	public double generarNotaBD(double notaRandom, int id){
		double notaBD;
		Alumnos a;
		a=buscarAlumno(id);
		notaBD=notaRandom;
		return notaBD;
	}
	
	public double generarNotaPro(double notaRandom, int id) {
		double notaPro;
		Alumnos a;
		a=buscarAlumno(id);
		notaPro=notaRandom;
		return notaPro;
	}
	
	public void agregarAlumno(Alumnos a) {
		listaAlumnos.add(a);
	}
	
	public void eliminarAlumno(int id) {
		Alumnos a;
		a=buscarAlumno(id);
		listaAlumnos.remove(a);
	}
	
	public void verAlumnos() {
		for(Alumnos alumnos: listaAlumnos) {
			System.out.println(alumnos);
		}
	}

}
