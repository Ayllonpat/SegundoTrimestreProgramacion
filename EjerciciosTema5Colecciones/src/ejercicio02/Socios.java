package ejercicio02;

public class Socios {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	private double cuota;
	
	public Socios(String nombre, String apellidos, int edad, String dni, double cuota) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		this.cuota = cuota;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Socios [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + ", cuota="
				+ cuota + "]";
	}
	
	
	

}
