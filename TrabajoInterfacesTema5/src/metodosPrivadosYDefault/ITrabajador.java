package metodosPrivadosYDefault;

import java.util.List;

public interface ITrabajador {
	
	//el profesor pasa lista
	 public default int pasarLista(List<Persona> listaAlumnos) {
		 int numeroAlumnos=0;
		 numeroAlumnos=listaAlumnos.size();
		 return numeroAlumnos;
	 }
	//muestra que el profesor está dando clase
	 public default void darClase(String dni) {
		 System.out.println("Ha comenzado a explicar");
	 }

}
