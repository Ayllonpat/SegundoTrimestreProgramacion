package metodosPrivadosYDefault;

public interface ITrabajador {
	
	 default void corregir() {
		 System.out.println("Se ha sentado a corregir");
	 }
	
	 default void darClase() {
		 System.out.println("Ha comenzado a explicar");
	 }

}
