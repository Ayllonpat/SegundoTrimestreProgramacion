package ejercicio1;

import java.util.function.Predicate;

public class AlumnoUtils {
	
	
	
	public static Predicate<Alumno> filtroCurso(String nombreCurso){
		
		return (Alumno a) -> {
			return a.getNombreCurso().equals(nombreCurso);
		};
		
	}
	
	/*public static Predicate<Alumno> filtroPrimeraLetra(){
		
	}*/
	
	public static Predicate<Alumno> filtroMediaMayor9(double notaMedia){
		
		return (Alumno a) -> {
			return a.getNotaMedia()>(notaMedia);
		};
	}

}
