package metodosPrivadosYDefault;

public class Alumno extends Persona implements IEstudios, IColegio{
	
	private String clase;

	public Alumno(String nombre, String apellidos, int edad, String dni, String clase) {
		super(nombre, apellidos, edad, dni);
		this.clase = clase;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Alumno [clase=" + clase + "]";
	}

	@Override
	public void entrarColegio() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void salirColegio() {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void estudiar() {
		// TODO Auto-generated method stub
		IEstudios.super.estudiar();
	}
	
	@Override
	public void hacerExamen() {
		// TODO Auto-generated method stub
		IEstudios.super.hacerExamen();
	}
	

}
