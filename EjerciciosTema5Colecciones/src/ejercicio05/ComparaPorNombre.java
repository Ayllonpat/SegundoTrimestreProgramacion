package ejercicio05;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		return (p1.getNombre().toLowerCase().compareTo(p2.getNombre().toLowerCase()));
	} //se crea una nueva clase por 1+.. formas de comparar
	
	

}