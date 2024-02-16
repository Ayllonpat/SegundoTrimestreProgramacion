package ejercicio03;

import java.util.Set;

public class Alumnos {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private int curso;
	private String letra;
	private int id;
	
	public Alumnos(String nombre, String apellidos, int edad, int curso, String letra, int id) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.curso = curso;
		this.letra = letra;
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

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", curso=" + curso
				+ ", letra=" + letra + ", id=" + id + "]";
	}

	public boolean contains(int id) {
		// TODO Auto-generated method stub
		
		return true;
	}
	
	

}
