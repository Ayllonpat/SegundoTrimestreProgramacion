package ejemploSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Crud {
	
	

	private Set<Persona> listado;

	public Crud(Set<Persona> listado) {
		super();
		this.listado = listado;
	}

	public Set<Persona> getListado() {
		return listado;
	}

	public void setListado(Set<Persona> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Crud [listado=" + listado + "]";
	}

	
	public void borrar(String dni, Iterator<Persona> it) {
		
	
		if(listado.contains(dni)) {
			listado.remove(it.hasNext());
		}
	
	}
	
	
}
