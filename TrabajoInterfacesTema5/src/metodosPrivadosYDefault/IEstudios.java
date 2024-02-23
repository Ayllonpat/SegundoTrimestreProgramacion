package metodosPrivadosYDefault;

public interface IEstudios{
	
	//genera una nota aleatoria
	public default double hacerExamen (double notaRandom){
		
		return notaRandom;
	}
	//muestra si el alumno ha aprobado o no
	public default void mostrarAprobado(double notaRandom) {
		
		if(notaRandom>5){
			System.out.println("El alumno ha aprobado");
		}else {
			System.out.println("El alumno ha suspendido");
		}
	}
	
	
}
