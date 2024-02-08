package ejemploSet;

import java.util.HashSet;
<<<<<<< HEAD
import java.util.Iterator;
=======
>>>>>>> 2d18832825a2b345c737f2eb9ba0f725351d6a5d
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

	
<<<<<<< HEAD
	public void borrar(String dni, Iterator<Persona> it) {
		
	
		if(listado.contains(dni)) {
			listado.remove(it.hasNext());
		}
	
=======
	public Set<Persona> buscar(String dni) {
		boolean encontrado = false;
		boolean deLista=((Persona) listado).get(dni);
		while(listado.contains(dni)) {
			encontrado=true;}
		
		if(encontrado){
			return listado;
		}else {
			return null;
			}
		
>>>>>>> 2d18832825a2b345c737f2eb9ba0f725351d6a5d
	}
}
