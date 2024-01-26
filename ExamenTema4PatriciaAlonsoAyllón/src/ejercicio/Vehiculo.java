package ejercicio;

public abstract class Vehiculo implements IAlquiler{
	
	private String matricula;
	private double tamanio;
	private int anioFabricacion;
	private int id;
	
	public Vehiculo(String matricula, double tamanio, int anioFabricacion, int id) {
		super();
		this.matricula = matricula;
		this.tamanio = tamanio;
		this.anioFabricacion = anioFabricacion;
		this.id=id;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tamanio=" + tamanio + ", anioFabricacion=" + anioFabricacion
				+ "]";
	}

	
	
	

}
