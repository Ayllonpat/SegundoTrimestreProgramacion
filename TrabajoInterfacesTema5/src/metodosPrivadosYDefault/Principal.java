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
		 * mantener silencio. Los profesores podrán pasar listay dar clase. Los 
		 * alumnos podrán realizar examenes y ver si estan aprobados.
		 * Los practicantes podrán hacerlos 4 métodos anteriores.
		 * Debe utilizar metodos static y default
		 */
		
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random(System.nanoTime());
		
		List<Persona> listaPersonasColegio=new ArrayList<Persona>();
		List<Persona> listaAlumnos=new ArrayList<Persona>();
		List<Persona> listaProfesores=new ArrayList<Persona>();
		List<Persona> listaPracticantes=new ArrayList<Persona>();
		
		int opcion=0;
		String aux;
		String nombre=null;
		String apellidos=null;
		int edad=0;
		String dni=null;
		double hasta=10;
		double desde=0;
		double notaRandom = 0;
		double nota=0;
		
		//añadimos objetos para tener datos en la lista
		Persona p1=new Profesor("Patty", "Ayllón", 21, "1A");
		Persona p2=new Practicante("Iván", "Machuca", 24, "2B");
		Persona p3=new Alumno("Pedro", "Laffon", 12, "3C");
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
		
		listaPracticantes.add(p2);
		listaPracticantes.add(p5);
		
		Crud c = new Crud (listaPersonasColegio);
		
		Persona p=new Alumno(nombre, apellidos, edad, dni);
		Persona pr=new Profesor(nombre, apellidos, edad, dni);
		Persona pa=new Practicante(nombre, apellidos, edad, dni);
		
		do {
			
			System.out.println();
			
			System.out.println("""
					--------------------------------------------------------------------
					Bienvenido al programa:
					--------------------------------------------------------------------
					
					Elija una opción:
					
						1.Añadir Personas
						2.Eliminar Personas
						3.Dar Clase
						4.Se realiza examen
						5.Pasar Lista
						6.Mostrar personas
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

						System.out.println("Nombre");
						nombre = sc.nextLine();
						
						System.out.println("Apellidos");
						apellidos = sc.nextLine();
						
						System.out.println("Indique la edad:");
						aux=sc.nextLine();
						edad=Integer.parseInt(aux);
						
						System.out.println("DNI");
						dni = sc.nextLine();
						
						c.aniadirPersona(p, listaProfesores, listaPracticantes, listaAlumnos);
						
						break;
						
					case 2:
						
						p=pr;
						
						System.out.println("Nombre");
						nombre = sc.nextLine();
						
						System.out.println("Apellidos");
						apellidos = sc.nextLine();
						
						System.out.println("Indique la edad:");
						aux=sc.nextLine();
						edad=Integer.parseInt(aux);
						
						System.out.println("DNI");
						dni = sc.nextLine();
						
						c.aniadirPersona(p, listaProfesores, listaPracticantes, listaAlumnos);
						break;
						
					case 3:
						
						p=pa;
						
						System.out.println("Nombre");
						nombre = sc.nextLine();
						
						System.out.println("Apellidos");
						apellidos = sc.nextLine();
						
						System.out.println("Indique la edad:");
						aux=sc.nextLine();
						edad=Integer.parseInt(aux);
						
						System.out.println("DNI");
						dni = sc.nextLine();
						
						c.aniadirPersona(p, listaProfesores, listaPracticantes, listaAlumnos);
						break;
				
					case 0:
						System.out.println("Saliendo...");
						break;
					
					default:
						System.out.println("OPCIÓN NO DISPONIBLE");
						break;
				}
				
				break;
				
			case 2:
				System.out.println("""
						Elija que tipo quiere eliminar:
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
						
						System.out.println("Escriba el dni:");
						
						dni=sc.nextLine();
						
						c.borrarPersona(dni, listaProfesores, listaPracticantes, listaAlumnos);
						
						break;
						
					case 2:
						
						System.out.println("Escriba el dni:");
						
						dni=sc.nextLine();
						
						c.borrarPersona(dni, listaProfesores, listaPracticantes, listaAlumnos);
						break;
						
					case 3:
						
						System.out.println("Escriba el dni:");
						
						dni=sc.nextLine();
						
						c.borrarPersona(dni, listaProfesores, listaPracticantes, listaAlumnos);
						break;
				
					case 0:
						System.out.println("Saliendo...");
						break;
					
					default:
						System.out.println("OPCIÓN NO DISPONIBLE");
						break;
				}
				break;
				
			case 3:
				
				System.out.println("Indique el dni del profesor:");
				dni = sc.nextLine();
				
				System.out.println(c.buscarEnListaProfesores(dni, listaProfesores));
				
				pr.darClase(dni);
				
				IColegio.mostrarSilencio();
				break;
				
			case 4:
				System.out.println("Indique el dni del alumno:");
				dni=sc.nextLine();
				System.out.println(c.buscarEnListaProfesores(dni, listaAlumnos));
				notaRandom=rnd.nextDouble(hasta-desde+1)+desde;
				System.out.println(p.hacerExamen(notaRandom));
				IColegio.mostrarSilencio();
				p.mostrarAprobado(notaRandom);
				break;	
				
			case 5:
				System.out.println("Indique el dni del profesor:");
				dni = sc.nextLine();
				
				System.out.println(c.buscarEnListaProfesores(dni, listaProfesores));
				System.out.println("Hay un total de "+pr.pasarLista(listaAlumnos)+ " alumnos");
				
				IColegio.mostrarSilencio();
				break;
				
			case 6:
				System.out.println("""
						Elija que tipo quiere ver:
						--------------------------------------------------------------------
							
							1.Alumnos
							2.Profesores
							3.Becarios
							4.Todos
							0.Salir
							
						--------------------------------------------------------------------	
						""");
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				
				switch(opcion) {
				
					case 1:
						c.mostrarListaAlumnos(listaAlumnos);
						break;
						
					case 2:
						c.mostrarListaProfesores(listaProfesores);
						break;
						
					case 3:
						c.mostrarListaPracticantes(listaPracticantes);
						break;
						
					case 4:
						c.mostrarLista();
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
