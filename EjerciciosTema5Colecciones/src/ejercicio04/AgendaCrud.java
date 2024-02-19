package ejercicio04;

import java.util.Iterator;
import java.util.Map;

import ejercicio02.Socios;

public class AgendaCrud {

	private Map<Contactos, Telefonos> listaContactos;

	public AgendaCrud(Map<Contactos, Telefonos> listaContactos) {
		super();
		this.listaContactos = listaContactos;
	}

	public Map<Contactos, Telefonos> getListaContactos() {
		return listaContactos;
	}

	public void setListaContactos(Map<Contactos, Telefonos> listaContactos) {
		this.listaContactos = listaContactos;
	}

	@Override
	public String toString() {
		return "AgendaCrud [listaContactos=" + listaContactos + "]";
	}
	
	public void mostrarListaContactos(){
		System.out.println(listaContactos);
	}
	
	public void buscarContactoPorNombre(String nombre) {
			
		Contactos c = null;
		boolean encontrado=false;
		
		while (listaContactos.containsKey(nombre)) {
			encontrado=listaContactos.get(c).equals(nombre);
		
		}
		
	}
	
}
