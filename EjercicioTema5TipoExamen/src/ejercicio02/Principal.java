package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Gestionaremos una empresa de alquileres de trasteros. Tendremos la clase Trastero cuyas características son la capacidad
			en metros cuadrados, dirección (String con la calle), número de trastero, precio y si está ocupado o no.
			
			Crear también una clase Oficina donde tendremos como atributo una lista de trasteros de tipo List y donde se tendrá
			métodos para hacer realizar las siguientes funcionalidades (no todas tienen que coincidir con un método):
			
				• Añadir un nuevo trastero al final de la lista con los datos leídos por teclado.
				• Buscar un trastero por precio.
				• Buscar un trastero por número devolviendo el trastero en cuestión.
				• Buscar al trastero más caro, es decir, el de precio mayor.
				• Eliminar un trastero.
				• Modificar un trastero elegido por el usuario, modificando únicamente su precio.
				• Ordenar la lista de trasteros por número (orden natural) y por precio (orden no natural) de mayor a menor.
				• Mostrar usando for each solo los trasteros no ocupados.
			
			Crear una clase principal con un menú donde se puedan comprobar las funcionalidades del programa, pudiéndose repetir
			el mismo hasta que el usuario decida.
			
			Se pueden agregar al comienzo algunos objetos a la colección para tener elementos de prueba o un método que cargue la
			lista con varios elementos.
			
			Se puede hacer uso SOLO Y EXCLUSIVAMENTE del API de Java.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		List<Trastero> listaTrasteros=new ArrayList<Trastero>();
		
		double m2=0;
		String direccion=null;
		int nTrastero=0;
		double precio=0;
		boolean ocupado=false;
		String aux;
		int opcion=0;
		int subOpcion=0;
		int nTrasteroNuevo= 0;
		
		//creamos objetos para tener datos base
		Trastero t1=new Trastero(23.5, "C/Virgén Fatima Nº45", 0, 12.5, false);
		Trastero t2=new Trastero(20, "C/Magdalena Nº2", 1, 13, true);
		Trastero t3=new Trastero(19.2, "C/Luis Montoto Nº56", 2, 15.75, false);
		Trastero t4=new Trastero(22, "C/Virgén Fatima Nº22", 3, 10, true);
		
		listaTrasteros.add(t1);
		listaTrasteros.add(t2);
		listaTrasteros.add(t3);
		listaTrasteros.add(t4);
		
		Oficina o=new Oficina(listaTrasteros);
		
		do {
		
		System.out.println("""
				
				--------------------------------------------------------------
				                   Bienvenido al programa
				--------------------------------------------------------------
				
				 Elija que desea hacer:
					
					1.Mostrar todos los trasteros
					2.Buscar trastero
					3.Añadir trastero
					4.Eliminar trastero
					5.Editar datos del trastero
					6.Ver trasteros vacios
					
				--------------------------------------------------------------
				""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
		
			switch(opcion) {
			
			case 1:
				
				do {	
					
					System.out.println("""
		
							 Elija el orden:
								
								1.Según fecha de insercción
								2.Según su número de identificación
								3.Según precio
								
							--------------------------------------------------------------
							""");
				
					aux=sc.nextLine();
					subOpcion=Integer.parseInt(aux);
					
					switch(subOpcion) {
						
						case 1:
							o.mostrarListaOrdenAnianido();
							subOpcion=0;
							break;
							
						case 2:
							o.mostrarListaNumero();
							subOpcion=0;
							break;
							
						case 3:
							o.mostrarListaPrecio();
							subOpcion=0;
							break;
						
						case 0:
							System.out.println("Saliendo...");
							break;
							
						default:
							System.out.println("OPCIÓN NO DISPONIBLE");
							break;
						}
				
				}while(subOpcion!=0);
				
				break;
				
			case 2:
				
				do {
					
					System.out.println("""
							
							 Elija según que:
								
								1.Según precio
								2.Según su número
								3.Mostrar piso más caro
								
							--------------------------------------------------------------
							""");
					
					aux=sc.nextLine();
					subOpcion=Integer.parseInt(aux);
					
					switch(subOpcion) {
					
						case 1:
							System.out.println("Indique el precio:");
								aux=sc.nextLine();
								precio=Double.parseDouble(aux);
							System.out.println(o.buscarPorPrecio(precio));
							subOpcion=0;
							break;
							
						case 2:
							System.out.println("Indique el número:");
								aux=sc.nextLine();
								nTrastero=Integer.parseInt(aux);
							System.out.println(o.buscarPorNumero(nTrastero));
							subOpcion=0;
							break;
							
						case 3:
							System.out.println(o.buscarPorMayorPrecio());
							subOpcion=0;
							break;
					
						case 0:
							System.out.println("Saliendo...");
							break;
							
						default:
							System.out.println("OPCIÓN NO DISPONIBLE");
							break;
						}
				
				}while(subOpcion!=0);
				
				break;
				
			case 3:
				
				System.out.println("Escriba los m2:");
					aux=sc.nextLine();
					m2=Double.parseDouble(aux);
				System.out.println("Escriba la dirección:");
					direccion=sc.nextLine();
				System.out.println("Escriba el número del trastero:");
					aux=sc.nextLine();
					nTrastero=Integer.parseInt(aux);
				System.out.println("Escriba el precio del día:");
					aux=sc.nextLine();
					precio=Double.parseDouble(aux);
					
				Trastero t=new Trastero(m2, direccion, nTrastero, precio, ocupado);	
				
				o.agregar(t);
				
				break;
				
			case 4:
				System.out.println("Escriba el número del trastero que desea borrar:");
					aux=sc.nextLine();
					nTrastero=Integer.parseInt(aux);
				o.borrar(nTrastero);
				break;
				
			case 5:
				System.out.println("Escriba el número del trastero que desea editar:");
					aux=sc.nextLine();
					nTrastero=Integer.parseInt(aux);
					
				System.out.println("Escriba los m2:");
					aux=sc.nextLine();
					m2=Double.parseDouble(aux);
				System.out.println("Escriba la dirección:");
					direccion=sc.nextLine();
				System.out.println("Escriba el número del trastero:");
					aux=sc.nextLine();
					nTrasteroNuevo=Integer.parseInt(aux);
				System.out.println("Escriba el precio del día:");
					aux=sc.nextLine();
					precio=Double.parseDouble(aux);
				System.out.println("Escriba true o false:");
					aux=sc.nextLine();
					ocupado=Boolean.parseBoolean(aux);
					
					o.editar(nTrastero, m2, direccion, nTrasteroNuevo, precio, ocupado);
					
				break;
				
			case 6:
				o.mostrarTrasterosVacios();
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
