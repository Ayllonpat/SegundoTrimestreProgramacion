package ejercicio05;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellidos;
	private int edad;
	private int id;
	
	public Persona(String nombre, String apellidos, int edad, int id) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", id=" + id + "]";
	}
	
	public int compareTo(Persona p) { //compareTo(p1) natural si es comprare(p1, p2) es no natural
		if(this.edad<p.getEdad()) {
			return -1;
		}else{
			if(this.edad>p.getEdad()) {
			return 1;}
		}return 0;
	}

}
