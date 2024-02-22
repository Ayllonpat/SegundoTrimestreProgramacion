package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear una pequeña lista con los datos personales de algunas Personas, y mostrarla por pantalla de
			forma NO ordenada y de forma ordenada (elegid la forma de ordenar vosotros, podéis empezar con
			orden natural, es decir, alfabéticamente y después crear otra “no natural”).
		 */
		
		List<Persona> listaPersonas=new ArrayList<Persona>();
		
		int opcion=0;
		String aux;
		String nombre;
		String apellidos;
		int edad;
		int id;
		
		listaPersonas.add(new Persona("Patty", "Ayllón", 21, 1));
		listaPersonas.add(new Persona("Iván", "Machuca", 24, 2));
		listaPersonas.add(new Persona("Pedro", "Laffon", 12, 3));
		
		Collections.sort(listaPersonas);
		
		for(Persona p:listaPersonas) {
			
			System.out.println(p);
		}
		
		Collections.sort(listaPersonas, new ComparaPorNombre());
		
		for(Persona p:listaPersonas) {
			
			System.out.println(p);
		}
		
			

	}

}
