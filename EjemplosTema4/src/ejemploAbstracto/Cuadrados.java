package ejemploAbstracto;

public class Cuadrados extends Figura{ //si no pones el metodo debes escribir  public abstract class
	
	private double lado;

	public Cuadrados(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
	}
	
	@Override //para poder llamarlo usabdo la clase madre
	public double calcularArea() {
		return lado*lado;
	}

}
