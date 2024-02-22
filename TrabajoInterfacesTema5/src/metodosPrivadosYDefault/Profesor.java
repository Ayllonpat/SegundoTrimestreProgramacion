package metodosPrivadosYDefault;

import java.util.List;

public class Profesor extends Persona implements ITrabajador, IColegio{
	
	private List<Persona> listaProfesores;

	public Profesor(String nombre, String apellidos, int edad, String dni, List<Persona> listaProfesores) {
		super(nombre, apellidos, edad, dni);
		this.listaProfesores = listaProfesores;
	}
	

	public List<Persona> getListaProfesores() {
		return listaProfesores;
	}


	public void setListaProfesores(List<Persona> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}


	@Override
	public String toString() {
		return "Profesor [listaProfesores=" + listaProfesores + "]";
	}

	@Override
	public void aniadirPersona(Persona p) {
		// TODO Auto-generated method stub
		listaProfesores.add(p);
		
	}

	@Override
	public void borrarPersona(Persona p) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	

}
