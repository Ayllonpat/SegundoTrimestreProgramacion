package ejercicio1;

import java.util.List;

public class Secretaria {
	
	private List listaAlumnos;

	public Secretaria(List listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public List getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Secretaria [listaAlumnos=" + listaAlumnos + "]";
	}
	
	/*private List<Alumno> buscarPorPrimeraLetra(String primeraLetra){
		listaAlumnos.forEach(t -> null);
	}*/

}
