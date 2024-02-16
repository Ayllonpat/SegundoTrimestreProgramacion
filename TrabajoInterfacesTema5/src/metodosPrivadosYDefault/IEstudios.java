package metodosPrivadosYDefault;

public interface IEstudios {
	
	default void estudiar() {
		System.out.println("Ha abierto los apuntes");
	}
	
	default void hacerExamen() {
		System.out.println("Empieza el examen");
	}
	
}
