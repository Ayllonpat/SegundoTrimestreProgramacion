package ejemploPoliformismo;

public abstract class Figura {
	
	private String nombre;
	private String color;
	
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	public void metodoSoloFigura() {
		
		System.out.println("Solo estoy en la clase Figura, sin extender a las hijas");
		
	}

}
