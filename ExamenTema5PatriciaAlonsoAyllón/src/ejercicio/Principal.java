package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		List<Carta> listaCartas=new ArrayList<Carta>();
		
		int opcion=0;
		String nombre=null;
		
		//oros
		Carta c1O=new Carta("As", "oros", 1);
		Carta c2O=new Carta("Dos", "oros", 2);
		Carta c3O=new Carta("Tres", "oros", 3);
		Carta c4O=new Carta("Cuatro", "oros", 4);
		Carta c5O=new Carta("Cinco", "oros", 5);
		Carta c6O=new Carta("Seis", "oros", 6);
		Carta c7O=new Carta("Siete", "oros", 7);
		Carta c8O=new Carta("Ocho", "oros", 8);
		Carta c9O=new Carta("Nueve", "oros", 9);
		Carta c10O=new Carta("Sota", "oros", 10);
		Carta c11O=new Carta("Caballo", "oros", 11);
		Carta c12O=new Carta("Rey", "oros", 12);
		
		//copas
		Carta c1C=new Carta("As", "copas", 1);
		Carta c2C=new Carta("Dos", "copas", 2);
		Carta c3C=new Carta("Tres", "copas", 3);
		Carta c4C=new Carta("Cuatro", "copas", 4);
		Carta c5C=new Carta("Cinco", "copas", 5);
		Carta c6C=new Carta("Seis", "copas", 6);
		Carta c7C=new Carta("Siete", "copas", 7);
		Carta c8C=new Carta("Ocho", "copas", 8);
		Carta c9C=new Carta("Nueve", "copas", 9);
		Carta c10C=new Carta("Sota", "copas", 10);
		Carta c11C=new Carta("Caballo", "copas", 11);
		Carta c12C=new Carta("Rey", "copas", 12);
		
		//espadas
		Carta c1E=new Carta("As", "espadas", 1);
		Carta c2E=new Carta("Dos", "espadas", 2);
		Carta c3E=new Carta("Tres", "espadas", 3);
		Carta c4E=new Carta("Cuatro", "espadas", 4);
		Carta c5E=new Carta("Cinco", "espadas", 5);
		Carta c6E=new Carta("Seis", "espadas", 6);
		Carta c7E=new Carta("Siete", "espadas", 7);
		Carta c8E=new Carta("Ocho", "espadas", 8);
		Carta c9E=new Carta("Nueve", "espadas", 9);
		Carta c10E=new Carta("Sota", "espadas", 10);
		Carta c11E=new Carta("Caballo", "espadas", 11);
		Carta c12E=new Carta("Rey", "espadas", 12);
		
		//bastos
		Carta c1B=new Carta("As", "bastos", 1);
		Carta c2B=new Carta("Dos", "bastos", 2);
		Carta c3B=new Carta("Tres", "bastos", 3);
		Carta c4B=new Carta("Cuatro", "bastos", 4);
		Carta c5B=new Carta("Cinco", "bastos", 5);
		Carta c6B=new Carta("Seis", "bastos", 6);
		Carta c7B=new Carta("Siete", "bastos", 7);
		Carta c8B=new Carta("Ocho", "bastos", 8);
		Carta c9B=new Carta("Nueve", "bastos", 9);
		Carta c10B=new Carta("Sota", "bastos", 10);
		Carta c11B=new Carta("Caballo", "bastos", 11);
		Carta c12B=new Carta("Rey", "bastos", 12);
		
		//oros
		listaCartas.add(c1O);
		listaCartas.add(c3O);
		listaCartas.add(c4O);
		listaCartas.add(c5O);
		listaCartas.add(c6O);
		listaCartas.add(c7O);
		listaCartas.add(c8O);
		listaCartas.add(c9O);
		listaCartas.add(c10O);
		listaCartas.add(c11O);
		listaCartas.add(c12O);
		
		//copas
		listaCartas.add(c1C);
		listaCartas.add(c3C);
		listaCartas.add(c4C);
		listaCartas.add(c5C);
		listaCartas.add(c6C);
		listaCartas.add(c7C);
		listaCartas.add(c8C);
		listaCartas.add(c9C);
		listaCartas.add(c10C);
		listaCartas.add(c11C);
		listaCartas.add(c12C);
		
		
		//espadas
		listaCartas.add(c1E);
		listaCartas.add(c3E);
		listaCartas.add(c4E);
		listaCartas.add(c5E);
		listaCartas.add(c6E);
		listaCartas.add(c7E);
		listaCartas.add(c8E);
		listaCartas.add(c9E);
		listaCartas.add(c10E);
		listaCartas.add(c11E);
		listaCartas.add(c12E);
		
		//bastos
		listaCartas.add(c1B);
		listaCartas.add(c3B);
		listaCartas.add(c4B);
		listaCartas.add(c5B);
		listaCartas.add(c6B);
		listaCartas.add(c7B);
		listaCartas.add(c8B);
		listaCartas.add(c9B);
		listaCartas.add(c10B);
		listaCartas.add(c11B);
		listaCartas.add(c12B);
		
		Mazo m=new Mazo(listaCartas);
		
		do {
			m.ordenarPorPalo();
			m.mostrarLista();
			m.ordenarPorPuntuacion();
			m.mostrarLista();
			
			m.buscarCartaNYP(opcion, nombre);
			//m.buscarCartaValor0();
			
			//m.editar(null, nombre, 0, nombre);
			
			
		}while(opcion!=0);
	}

}
