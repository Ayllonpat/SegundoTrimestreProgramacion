package metodosPrivadosYDefault;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ENUNCIADO
		 * Debe crear un programa en el que podamos añadir, borrar y editar una 
		 * lista de las personas en el colegio que tendrán los atributos nombre, 
		 * apellidos, edad y dni. Todos deben poder entrar, salir del colegio y
		 * mantener silencio. Los profesores impartiran una asignatura y podrán
		 * corregir y dar clase. Los alumnos estarán en una clase y podrán 
		 * estudiar y realizar examenes. Los practicantes podrán hacer
		 * los 4 métodos anteriores.
		 * Debe utilizar metodos static y default
		 */
		
		Scanner sc=new Scanner(System.in);
		
		List<Persona> listaPersonasColegio=new ArrayList<Persona>();
		
		int opcion=0;
		String aux;
		String nombre;
		String apellidos;
		int edad;
		String dni;
		String asignatura;
		String clase;
		
		//añadimos objetos para tener datos en la lista
		Persona p1=new Profesor("Patty", "Ayllón", 21, "1A", "Mates");
		Persona p2=new Practicante("Iván", "Machuca", 24, "2B");
		Persona p3=new Alumno("Pedro", "Laffon", 12, "3C", "1ºA");
		
		listaPersonasColegio.add(p1);
		listaPersonasColegio.add(p2);
		listaPersonasColegio.add(p3);
		
		do {
			
			System.out.println("""
					----------------------------------
					Bienvenido al programa:
					----------------------------------
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
		}while(opcion!=0);
		
	}

}
