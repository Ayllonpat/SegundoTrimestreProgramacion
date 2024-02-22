package metodosPrivadosYDefault;

public interface IEstudios{
	
	public default double hacerExamendouble (Double notaRandom){
		double nota;
		nota=notaRandom;
		return nota;
	}
	
	public default void mostrarAprobado(double nota) {
		if(nota>5){
			System.out.println("El alumno ha aprobado");
		}else {
			System.out.println("El alumno ha suspendido");
		}
	}
	
	
}
