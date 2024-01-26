package ejercicio;

public class PatinesVoladores extends Vehiculo{
	
	private double pCaballos;

	public PatinesVoladores(String matricula, double tamanio, int anioFabricacion, int id,double pCaballos) {
		super(matricula, tamanio, anioFabricacion, id);
		this.pCaballos = pCaballos;
	}

	public double getpCaballos() {
		return pCaballos;
	}

	public void setpCaballos(double pCaballos) {
		this.pCaballos = pCaballos;
	}

	@Override
	public String toString() {
		return super.toString()+ "PatinesVoladores [pCaballos=" + pCaballos + "]";
	}

	@Override
	public double calcularPrecio(double cantidadBat) {
		double uno=1;
		// TODO Auto-generated method stub
		return pCaballos*uno;
	}

}
