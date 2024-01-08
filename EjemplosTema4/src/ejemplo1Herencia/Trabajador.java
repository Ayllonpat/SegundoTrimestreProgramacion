package ejemplo1Herencia;

public class Trabajador {
	
	private String nombre;
	private String puesto;
	private String dni;
	
	public Trabajador(String nombre, String puesto, String dni) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.dni = dni;
	}
	
	//constructor solo dni para llamarlo en empleado
	
	public Trabajador(String dni) {
		super();
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", dni=" + dni + "]";
	}
	
	public double calacularPaga() {
		return 0.0;
	}

}
