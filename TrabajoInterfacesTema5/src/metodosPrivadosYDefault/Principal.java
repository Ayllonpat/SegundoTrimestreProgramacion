package metodosPrivadosYDefault;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
		Random rnd=new Random(System.nanoTime());
		
		List<Persona> listaPersonasColegio=new ArrayList<Persona>();
		List<Persona> listaAlumnos=new ArrayList<Persona>();
		List<Persona> listaProfesores=new ArrayList<Persona>();
		
		int opcion=0;
		String aux;
		String nombre;
		String apellidos;
		int edad;
		String dni;
		String asignatura;
		String clase;
		double hasta=10;
		double desde=0;
		double notaRandom = 0;
		
		//añadimos objetos para tener datos en la lista
		Persona p1=new Profesor("Patty", "Ayllón", 21, "1A");
		Persona p2=new Practicante("Iván", "Machuca", 24, "2B");
		Persona p3=new Alumno("Pedro", "Laffon", 12, "3C", "1ºA");
		Persona p4=new Profesor("Carmen", "López", 43, "4D");
		Persona p5=new Practicante("Dani", "Martínez", 19, "5I");
		Persona p6=new Alumno("Maria", "Sánchez", 11, "6G");
		
		listaPersonasColegio.add(p1);
		listaPersonasColegio.add(p2);
		listaPersonasColegio.add(p3);
		listaPersonasColegio.add(p4);
		listaPersonasColegio.add(p5);
		listaPersonasColegio.add(p6);
		
		listaAlumnos.add(p2);
		listaAlumnos.add(p3);
		listaAlumnos.add(p6);
		listaAlumnos.add(p5);
		
		listaProfesores.add(p1);
		listaProfesores.add(p4);
		listaProfesores.add(p2);
		listaProfesores.add(p5);
		
		do {
			
			System.out.println();
			
			System.out.println("""
					--------------------------------------------------------------------
					Bienvenido al programa:
					--------------------------------------------------------------------
					
					Elija una opción:
					
						1.Añadir Personas
						2.Eliminar Personas
						3.Se realiza examen
						5.Se corrige examen
						6.Se calcula nota media
						0.Salir
						
					--------------------------------------------------------------------
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("""
						Elija que tipo quiere añadir:
						--------------------------------------------------------------------
							
							1.Alumnos
							2.Profesores
							3.Becarios
							0.Salir
							
						--------------------------------------------------------------------	
						""");
				
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				
				switch(opcion) {
				
					case 1:
						break;
						
					case 2:
						break;
						
					case 3:
						break;
				
					case 0:
						System.out.println("Saliendo...");
						break;
					
					default:
						System.out.println("OPCIÓN NO DISPONIBLE");
						break;
				}
				
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;
			
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");
				break;
			}
			
		}while(opcion!=0);
		
	}

}
