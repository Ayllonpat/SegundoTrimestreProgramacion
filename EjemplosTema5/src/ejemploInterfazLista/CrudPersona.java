package ejemploInterfazLista;

import java.util.List;

public class CrudPersona {
	
	private List <Persona> lista; //no poner new por lo que no se instancia los atributos

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}
	
	public Persona findByDni(String dni) {
		
		int i=0;
		boolean encontrado=false;
		while(i<lista.size()&& !encontrado) { //size para que no haya que indicar el tamaño
			Persona deLista =lista.get(i);
			if(deLista.getDni().equalsIgnoreCase(dni))
				encontrado = true;
			else i++;
		}
		if(encontrado)
			return lista.get(i);
		else
			return null;
	}
	
	/*
	 * public Persona findByDniV2(String dni) {
		Persona tem = null;
		boolean salir = false;
		
		for(int i = 0; i<lista.size();i++) {
			
		}
	}
	 */
	
	public void agregar(Persona p) { //nunca creamos el agregar oasandole los atributos sueltos del objeto
		lista.add(p);				//tampoco se duevuelve ningun tipo de mensaje 
	}
	
	public boolean agregarV2(Persona p) {
		return lista.add(p);
	}
	
	public void mostrarLista() {
		for (Persona p : lista) {
			System.out.println(p);
		}
	}
	
	public void borrar(String dni) {
		
		if(findByDni(dni)!=null) {
			lista.remove(findByDni(dni));
		}
	}


}
