package metodosPrivadosYDefault;

public class Profesor extends Persona implements ITrabajador, IColegio{
	
	private String asignatura;

	public Profesor(String nombre, String apellidos, int edad, String dni, String asignatura) {
		super(nombre, apellidos, edad, dni);
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + "]";
	}

	@Override
	public void aniadirPersona(Persona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarPersona(Persona p) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	

}
