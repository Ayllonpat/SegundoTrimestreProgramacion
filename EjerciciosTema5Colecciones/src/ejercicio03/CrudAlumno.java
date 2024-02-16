package ejercicio03;

import java.util.Iterator;
import java.util.Set;

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
		
		if(it.next().contains(id)) {
			return it.next();
		}else {
			return null;
		}
	}

	public double generarNotaBD(double notaRandom){
		double notaBD;
		notaBD=notaRandom;
		return notaBD;
	}
	
	public double generarNotaPro(double notaRandom) {
		double notaPro;
		notaPro=notaRandom;
		return notaPro;
	}

}
