package ejercicio04;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	
	public Entry <Contactos, Telefonos> buscarContactoPorNombre (String nombre) {
		
		Set <Entry <Contactos, Telefonos>> setContactos = listaContactos.entrySet();
		
		Iterator <Entry <Contactos, Telefonos>> it = setContactos.iterator();
		boolean encontrado = false;
		
		Entry <Contactos, Telefonos> entryContactos = null;
		
		while (it.hasNext() && !encontrado) {
			
			entryContactos = it.next();
			
			if (entryContactos.getKey().getNombre().equals(nombre)) {
				
				encontrado = true;
			}
		}
		
		return entryContactos;
	}
	
	public void borrarContacto(String nombre) {
		
		listaContactos.entrySet().remove(buscarContactoPorNombre(nombre));
	}
	
	public void editarNombre(String nombre, String nuevoNombre) {
		buscarContactoPorNombre(nombre).getKey().setNombre(nuevoNombre);		
	}
	
	public void editarTelefono(String nombre, int nuevoTelefono) {
		buscarContactoPorNombre(nombre).getValue().setNumero(nuevoTelefono);		
	}
	
	public void agregarNuevoContacto(Contactos nombreC, Telefonos telefonoN) {
		listaContactos.put(nombreC, telefonoN);
	}
	
	public void buscar() {
		
	}

}
