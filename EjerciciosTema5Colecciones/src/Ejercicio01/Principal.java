package Ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que permita gestionar notas de texto (como las de un móvil, no son calificaciones
			de clase). Usaremos la clase ArrayList y el listado debe guardar objetos tipo Nota (tú decides los
			atributos que debe tener una nota). Se podrán mostrar de manera individual (sin necesidad de buscar,
			solo diciendo cuál de la lista mostrada), dar información del número de notas guardadas, agregar una
			nueva nota, un método que borre una de las notas guardadas comprobando antes que la lista no está
			vacía. Se borrará por número (la nota 1, la 2...), por lo que habrá que mostrarle al usuario la lista con
			todas las notas (en un método) y su número correspondiente, el usuario introducirá el número de la
			que quiera borrar (esto no es lo ideal puesto que así habría que mostrar todas las notas ¿y si hay miles
			de ellas?). 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		List <Nota> lista= new ArrayList <Nota> ();
		
		CrudNota cn=new CrudNota(lista);
		
		int opcion=0, id = 0;
		String aux, texto, titulo;
		
		lista.add(new Nota("Holi", 0, "Saludos"));
		lista.add(new Nota("Adios",1, "Despedidas"));
		
		do{
		
		System.out.println("""
				---------------------------------------------------
				Notas
				---------------------------------------------------
				1.Mostrar todas las notas
				2.Agregar nota
				3.Buscar nota
				4.Borrar nota
				0.Salir
				---------------------------------------------------
				Elija:
				""");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		System.out.println("---------------------------------------------------");
		
		switch(opcion) {
		
		case 0:
			System.out.println("Saliendo...");
			break;
			
		case 1:
			cn.mostrar();
			break;
			
		case 2:
			System.out.println("Escriba el texto:");
			texto=sc.nextLine();
			System.out.println("Indique la id:");
			aux=sc.nextLine();
			id=Integer.parseInt(aux);
			System.out.println("Indique el titulo");
			titulo=sc.nextLine();
			Nota n=new Nota(texto, id, titulo);
			cn.agregar(n);
			break;
			
		case 3:
			System.out.println("Indique la id de la nota a buscar:");
			aux=sc.nextLine();
			id=Integer.parseInt(aux);
			cn.findById(id);
			break;
		case 4:
			cn.mostrar();
			System.out.println("Indique la id de la nota a borrar");
			aux=sc.nextLine();
			id=Integer.parseInt(aux);
			cn.findById(id);
			break;
			
		default:
			System.out.println("OPCION NO DISPONIBLE");
			break;
		}
		
		}while(opcion!=0);
			
	}

}
