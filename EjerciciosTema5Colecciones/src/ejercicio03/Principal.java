package ejercicio03;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar, modificar y borrar
			los que se quiera de forma individual, es decir, el usuario debe decir quién quiere mostrar, modificar
			o borrar. Se puede crear otra clase con funcionalidades como sacar nota media del curso, dar el número
			de suspensos en total, media de suspensos, etc. Usa la interfaz Set implementada por HashSet.
		 */
		
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random(System.nanoTime());
		
		Set <Alumnos> listaAlumnos = new HashSet <>();
		
		String aux;
		int opcion=0;
		int id;
		double hasta=10;
		double desde=0;
		double notaRandom;
		String nombre;
		String apellidos;
		int edad;
		int curso;
		String letra;
		
		
		listaAlumnos.add(new Alumnos("Maria", "López", 15, 4, "C", 1));
		listaAlumnos.add(new Alumnos("Fabian", "Snachez", 16, 4, "C", 2));
		listaAlumnos.add(new Alumnos("Adam", "López", 15, 4, "A", 3));
		
		CrudAlumno ca=new CrudAlumno(listaAlumnos);
		
		
		do {
			
			System.out.println("""
					----------------------------------------------
					Bienvenido al sistema, elija una opción:
					----------------------------------------------
					
						1.Mostrar lista de alumnos
						2.Buscar alumno
						3.Ingresar nota
						4.Ver nota media alumno
						5.Ver número de suspensos
						6.Añadir alumno
						7.Borrar alumno
						0.Salir
					
					-----------------------------------------------
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 1:
				System.out.println(listaAlumnos);
				break;
			
			case 2:
				System.out.println("Escriba la id:");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				System.out.println(ca.buscarAlumno(id));
				break;
				
			case 3:
				do {
				System.out.println("""
						Elija de que asignatura:
						-----------------------------------------------
							1.Base de Datos
							2.Programación
							0.Atrás
						-----------------------------------------------
						""");
					switch(opcion) {
						case 1:
							System.out.println("Indique la id del alumno:");
							notaRandom=rnd.nextDouble(hasta-desde+1)+desde;
							
							break;
						
						case 2:
							break;
							
						case 0:
							System.out.println("Saliendo...");
							break;
						
						default:
							System.out.println("OPCIÓN NO DISPONIBLE");
							break;
					}
				}while(opcion!=0);
				break;
			
			case 4:
				break;
				
			case 5:
				break;
			
			case 6:
				System.out.println("Introduzca el nombre:");
				nombre=sc.nextLine();
				System.out.println("Introduzca los apellidos:");
				apellidos=sc.nextLine();
				System.out.println("Introduzca la edad:");
				aux=sc.nextLine();
				edad=Integer.parseInt(aux);
				System.out.println("Introduzca el curso:");
				aux=sc.nextLine();
				curso=Integer.parseInt(aux);
				System.out.println("Introduzca la letra:");
				letra=sc.nextLine();
				System.out.println("Escriba la id:");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				Alumnos a=new Alumnos(nombre, apellidos, edad, curso, letra, id);
				ca.agregarAlumno(a);
				
				break;
				
			case 7:
				System.out.println("Escriba la id:");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
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
