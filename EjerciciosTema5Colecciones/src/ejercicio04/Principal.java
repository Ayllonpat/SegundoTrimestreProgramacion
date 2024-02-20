package ejercicio04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar, usando la clase HashMap, una agenda de teléfonos (un Contacto como clave y el número de
			teléfono como valor). Crear aquellos métodos que se utilizan normalmente en una agenda, como
			agregar, borrar, mostrar, buscar por algún criterio (por ejemplo, por nombre), modificar algún dato,
			etc. Y un main para probar todo.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		Map<Contactos, Telefonos> listaContactos= new HashMap <>();
		
		String aux;
		String nombre;
		String nuevoNombre;
		int telefono;
		int nuevoTelefono;
		int opcion;
		int opcion2;
		
		
		Contactos c1=new Contactos("Maria");
		Contactos c2=new Contactos("Patty");
		Contactos c3=new Contactos("Iván");
		
		Telefonos t1=new Telefonos(654789812);
		Telefonos t2=new Telefonos(654789813);
		Telefonos t3=new Telefonos(654789814);
		
		Set <Contactos> listaNombres= listaContactos.keySet();
		Collection <Telefonos> listaTelefonos=listaContactos.values();
		
		listaContactos.put(c1, t1);
		listaContactos.put(c2, t2);
		listaContactos.put(c3, t3);
		
		AgendaCrud ac=new AgendaCrud(listaContactos);
	
		
		do {
		
		System.out.println("""
				---------------------------------
				Bienvenido a la agenda:
				---------------------------------
				
				Elija una opción:
				
					1.Agregar contacto
					2.Borrar contacto
					3.Mostrar todos los contactos
					4.Buscar por nombre
					5.Editar contacto
					0.Salir
				""");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch(opcion) {
		
		case 1:
			System.out.println("Indique el nombre del contacto:");
			nombre=sc.nextLine();
			System.out.println("Indique el número de telefono:");
			aux=sc.nextLine();
			telefono=Integer.parseInt(aux);
			Contactos nombreC=new Contactos(nombre);
			Telefonos telefonoN=new Telefonos(telefono);
			ac.agregarNuevoContacto(nombreC, telefonoN);
			break;
			
		case 2:
			
			System.out.println("Escriba el contacto a borrar:");
			nombre=sc.nextLine();
			ac.borrarContacto(nombre);
			break;
			
		case 3:
			ac.mostrarListaContactos();
			break;
			
		case 4:
			System.out.println("Escriba el contacto a buscar:");
			nombre=sc.nextLine();
			System.out.println(ac.buscarContactoPorNombre(nombre));
			break;
			
		case 5:
			
			do {
				System.out.println("""
						---------------------------------
						Elija que desea hacer:
							1.Editar nombre
							2.Editar número
							0.Salir
						---------------------------------
						""");
				aux=sc.nextLine();
				opcion2=Integer.parseInt(aux);
				switch(opcion2) {
				case 1:
					System.out.println("Elija el contacto que desea editar:");
					nombre=sc.nextLine();
					System.out.println("Elija el nuevo nombre:");
					nuevoNombre=sc.nextLine();
					ac.editarNombre(nombre, nuevoNombre);
					break;
				case 2:
					System.out.println("Elija el contacto que desea editar:");
					nombre=sc.nextLine();
					System.out.println("Elija el nuevo telefono:");
					aux=sc.nextLine();
					nuevoTelefono=Integer.parseInt(aux);
					ac.editarTelefono(nombre, nuevoTelefono);
					break;
				case 0:
					System.out.println("Saliendo..");
					break;
					
				default:
					System.out.println("OPCIÓN NO DISPONIBLE");
					break;
				}
			}while(opcion2!=0);
			
			break;
			
		case 0:
			System.out.println("Saliendo..");
			break;
			
		default:
			System.out.println("OPCIÓN NO DISPONIBLE");
			break;
		
		}
		
		}while(opcion!=0);
		
		System.out.println("""
				---------------------------------
				Gracias por su atención
				---------------------------------
				""");
	}

}
