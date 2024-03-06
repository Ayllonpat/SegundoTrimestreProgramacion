package ejercicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Mazo {
	
	private List<Carta> listaCartas;

	public Mazo(List<Carta> listaCartas) {
		super();
		this.listaCartas = listaCartas;
	}

	public List<Carta> getListaCartas() {
		return listaCartas;
	}

	public void setListaCartas(List<Carta> listaCartas) {
		this.listaCartas = listaCartas;
	}

	@Override
	public String toString() {
		return "Mazo [listaCartas=" + listaCartas + "]";
	}
	
	public void ordenarPorPalo(){
		
	}
	
	public void ordenarPorPuntuacion() {
		
	}
	
	public void mostrarLista() {
		int i=0;
		for(Carta c:listaCartas) {
			System.out.println(c);
			i++;
		}
	}
	
	public Carta buscarCartaNYP(int numero, String palo) {
		int i=0;
		boolean encontrado=false;
		for(Carta c:listaCartas) {
			Carta lista=listaCartas.get(i);
			if(numero==lista.getNum() && palo==lista.getPalo()) {
				encontrado=true;
			}else {
				encontrado=false;
			}
		}
		if(encontrado) {
			return listaCartas.get(i);
		}else {
			return null;
		}
	}
	
	
	public Carta buscarCartaValor0() {
		int i=0;
		boolean encontrado=false;
		for(Carta c:listaCartas) {
			Carta lista=listaCartas.get(i);
			if(lista.devolverValorCarta(c)==0) {
				encontrado=true;
					i++;
				}else {
					encontrado=false;
					i++;
				}
			}
			if(encontrado) {
				return listaCartas.get(i);
				}else {
					return null;
			}
			
		}
	
	public Carta editar(Carta c, String nuevoNombre, int numero, String nombre) {
		c=buscarCartaNYP(numero, nombre);;
		c.setNombre(nuevoNombre);
		return c;
	}
	
	
}
