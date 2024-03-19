package ejercicio1;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Tenemos una clase Alumno caracterizada por su nombre, apellidos, nombre del curso, nota media y edad.
			Por otro lado, en la clase Secretaría contamos con una List de alumnos, en la que se pide que haya los métodos
			adecuados para, usando expresiones lambda y stream:
			
			* Obtener todos los alumnos de la lista usando filter.
			 
			* Mostrar todos los alumnos imprimiéndolos con forEach ().
			 
			* Imprimir todos los alumnos cuyo nombre empiece con una letra determinada (puede ser leída por teclado).
			 
			* Dar el tamaño de la lista usando count ().
			 
			* Obtener los alumnos con nota media mayor de 9 en el curso 1DAM.
			 
			* Imprimir los 3 primeros alumnos de la lista usando limit ().
			 
			* Obtener el alumno de menor edad.
			 
			* Obtener el primer alumno de la lista con findFirst().
			 
			* Obtener una nueva lista con los alumnos cuya longitud de la cadena de su nombre sea mayor a 10 letras.
			
			* Obtener los alumnos que empiecen por la letra A y la longitud de su nombre sea menor o igual a 6.

		 */
		
		Scanner sc=new Scanner(System.in);
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		int opcion=0;
		String aux;
		String primeraLetra;
		
		listaAlumnos.add(new Alumno("Iván", "Machuca", "1DAM", 8.3, 24));
		listaAlumnos.add(new Alumno("Patty", "Ayllón", "1DAM", 7.5, 21));
		listaAlumnos.add(new Alumno("Pedro", "Laffón", "1DAM", 9.4, 24));
		listaAlumnos.add(new Alumno("Marta", "Laffón", "1DAM", 6.7, 29));
		listaAlumnos.add(new Alumno("Lorena", "Machuca", "1DAM", 8.6, 30));
		listaAlumnos.add(new Alumno("Diego", "Cano", "1DAM", 5.3, 28));
		listaAlumnos.add(new Alumno("David", "Sevillano", "1DAM", 9.9, 22));
		listaAlumnos.add(new Alumno("Enzo", "Vor", "1DAM", 6.9, 30));
		listaAlumnos.add(new Alumno("Sergio", "Catalá", "1DAM", 4.9, 23));
		listaAlumnos.add(new Alumno("Carlos", "Páez", "1DAM", 7.3, 18));
		listaAlumnos.add(new Alumno("Fernando", "Cannesa", "1DAM", 5.5, 19));
		listaAlumnos.add(new Alumno("Alejandro", "Cannesa", "1DAM", 9.5, 23));
		listaAlumnos.add(new Alumno("Alex", "Cannesa", "1DAM", 9.5, 23));
		
		Secretaria s=new Secretaria(listaAlumnos);
		
		do {
		
			System.out.println("""
					-------------------------------------------------------------------------------------------
					\t\t\t\tBienvenido al programa:
					-------------------------------------------------------------------------------------------
					
					Indique que quiere hacer:
						
						1.Mostrar todos los alumnos.
						2.Buscar alumnos según la primera letra de su nombre.
						3.Dar tamaño de la lista.
						4.Ver alumnos con nota media mayor a 9.
						5.Ver los primeros 3 alumnos de la lista.
						6.Mostrar al alumno más pequeño
						7.Mostrar al primer alumno de la lista
						8.Ver alumnos cuyos nombre y apellidos juntos sumen más de 10 carácteres
						9.Mostrar alumnos que su nombre empiece por la letra A y la longitud 
							de su nombre sea menor o igual a 6.
						0.Salir
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 1:
					listaAlumnos.stream()
					.filter(Secretaria.filtroCurso("1DAM"))
					//.map(alumno -> alumno.getNombre())
					.forEach(System.out::println);
					break;
				case 2:
					System.out.println("Escriba la letra:");
					primeraLetra=sc.nextLine();
					listaAlumnos.stream()
					.filter(Secretaria.filtroPrimeraLetra(primeraLetra))
					.forEach(System.out::println);
					break;
				case 3:
					System.out.println(s.devolverTamanioLista());
					break;
				case 4:
					listaAlumnos.stream()
					.filter(Secretaria.filtroMediaMayor9(9))
					.forEach(System.out::println);
					break;
				case 5:
					//System.out.println(s.filtro3Primeras());
					break;
				case 6:
					listaAlumnos.stream()
					.filter(Secretaria.filtroMenorEdad())
					.forEach(System.out::println);
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
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
