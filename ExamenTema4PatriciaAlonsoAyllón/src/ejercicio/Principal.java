package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int tam=6;
		String aux;
		double precio;
		int numDias;
		int id;
		
		
		Vehiculo v1=new VehiculoGenerico("1111BBB", 2.5, 2008, 1);
		Vehiculo v2=new VehiculoGenerico("2222CCC", 3, 2016, 2);
		Vehiculo v3=new Batmoviles("3333DDD", 3.5, 2022,3, 4);
		Vehiculo v4=new Batmoviles("4444HHH", 4, 2020, 4, 6);
		Vehiculo v5=new PatinesVoladores("5555JJJ", 1, 2021, 5, 80.5);
		Vehiculo v6=new PatinesVoladores("6666KKK", 0.7, 2018, 6, 75.2);
		
		TiendaAlquileres t=new TiendaAlquileres();
		Vehiculo []lista=new Vehiculo[tam];
		
		lista[0]=v1;
		lista[1]=v2;
		lista[2]=v3;
		lista[3]=v4;
		lista[4]=v5;
		lista[5]=v6;
		
		System.out.println("Escriba la id del vehículo del que desea saber el precio:");
		aux=sc.nextLine();
		id=Integer.parseInt(aux);
		precio=t.calcularAlquilerVehiculo(lista, id);
		t.mostrarPrecio(precio);
		
		System.out.println(" ");
		System.out.println("********************************************************");
		System.out.println(" ");
		
		System.out.println("Mostrar lista:");
		t.mostrarListado(lista);
		
		System.out.println(" ");
		System.out.println("********************************************************");
		System.out.println(" ");
		
		System.out.println("Total recaudado:");
		System.out.println(t.calcularTotalRecaudado(lista));
		
		System.out.println(" ");
		System.out.println("********************************************************");
		System.out.println(" ");
		
		System.out.println("Total recaudado Batmoviles");
		System.out.println(t.calcularTotalRecaudadoBat(lista));
		
		System.out.println(" ");
		System.out.println("********************************************************");
		System.out.println(" ");
		
		System.out.println("Indique cuantos dias quiere alquilar y el id del vehiculo");
		aux=sc.nextLine();
		id=Integer.parseInt(aux);
		aux=sc.nextLine();
		numDias=Integer.parseInt(aux);
		System.out.println(t.calcularAlquilerVehiculoDias(lista, id, numDias));
	}

}
