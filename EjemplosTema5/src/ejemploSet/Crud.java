package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Crud {

	private Set <Persona> listado;

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
		
	}
}
