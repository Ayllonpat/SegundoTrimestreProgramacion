package ejemploAbstracto;

public abstract class Figura {
	
	private double x;
	private double y;
	
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public abstract double calcularArea(); //debemos crear el calcular area en figura para poder utilizar en las clases hijas
		// TODO Auto-generated method stub

}
