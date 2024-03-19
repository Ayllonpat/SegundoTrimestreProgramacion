package ejercicio1;

import java.util.List;
import java.util.function.Predicate;

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
	
	//filtrar por curso
	public static Predicate<Alumno> filtroCurso(String nombreCurso){
		
		return (Alumno a) -> {
			return a.getNombreCurso().equals(nombreCurso);
		};
		
	}
	//encontrar alumnos que empiezen por x letra
	public static Predicate<Alumno> filtroPrimeraLetra(String primeraLetra){
		return(Alumno a) -> {
			return a.getNombre().startsWith(primeraLetra.toUpperCase());
		};
	}
	//filtar por notamedia
	public static Predicate<Alumno> filtroMediaMayor9(double notaMedia){
		
		return (Alumno a) -> {
			return a.getNotaMedia()>(notaMedia);
		};
	}
	
	//contar numero de alumnos
	public int devolverTamanioLista() {
		
		return listaAlumnos.size();
	}
	//mostrar los tres primeros de la lista
	//public Alumno filtro3Primeras(){
		
		
	//}
	
	//alumno más pequeño
	public static Predicate<Alumno> filtroMenorEdad(){
		return (Alumno a) -> {
			return a.getEdad()<a.getEdad();
		};
	}
}
