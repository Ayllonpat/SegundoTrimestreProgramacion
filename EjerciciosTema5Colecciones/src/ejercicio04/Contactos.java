package ejercicio04;

public class Contactos {
	
	String nombre;

	public Contactos(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Contactos [nombre=" + nombre + "]";
	}
	
	
	
}
