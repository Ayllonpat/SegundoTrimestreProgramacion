package examenEjemplo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int tam=6;
		int opcion=0;
		double precioMin=0.5; 
		double limiteFurgo=4;
		double limiteCmCubMotos=250;
		double cantPorMetro=1;
		double numDiv=2;
		double sumaNavidad=20;
		String aux;
		
		Vehiculo v1=new Furgonetas(120, 5.5);
		Vehiculo v2=new Furgonetas(75, 3.4);
		Vehiculo v3=new Motos(180, 230);
		Vehiculo v4=new Motos(85, 260);
		Vehiculo v5=new Vehiculo(35);
		Vehiculo v6=new Furgonetas(140, 8.5);
		
		Vehiculo []lista=new Vehiculo[tam];
		lista[0]=v1;
		lista[1]=v2;
		lista[2]=v3;
		lista[3]=v4;
		lista[4]=v5;
		lista[5]=v6;
		Parking p=new Parking("C/Virgén de Fatima", lista);
		
		do {
			System.out.println("""
					-----------------------------------------------------
					Bienvenid@ al Parking
					-----------------------------------------------------
					Seleccione una opción:
					
						1.Mostrar lista
						2.Calcular precio del vehiculo deseado
						3.Calcular recaudado con las motos
						4.Calcular precio Navidad """);
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion){
			case 1:
				p.mostrarLista();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");
				break;
			}
		}while(opcion!=0);
		
		System.out.println("""
				-----------------------------------------------------
				Gracias por su atención :)
				-----------------------------------------------------
				""");
		
		
		
	
	}
}
