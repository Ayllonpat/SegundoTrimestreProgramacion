package metodosPrivadosYDefault;

public interface ITrabajador {
	
	 default int pasarLista(Persona []listaAlumnos) {
		 int numeroAlumnos=0;
		 numeroAlumnos=listaAlumnos.length;
		 return numeroAlumnos;
	 }
	
	 default void darClase() {
		 System.out.println("Ha comenzado a explicar");
	 }

}
