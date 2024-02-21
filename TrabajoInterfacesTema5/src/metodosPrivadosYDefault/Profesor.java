package metodosPrivadosYDefault;

public class Profesor extends Persona implements ITrabajador, IColegio{
	
	private String asignatura;

	public Profesor(String nombre, String apellidos, int edad, String dni, String asignatura) {
		super(nombre, apellidos, edad, dni);
		this.asignatura = asignatura;
	}

	@Override
	public void entrarColegio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salirColegio() {
		// TODO Auto-generated method stub
		
	}
	
	

}
