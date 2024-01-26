package ejercicio;

public class Batmoviles extends Vehiculo{
	
	private int nRuedas;

	public Batmoviles(String matricula, double tamanio, int anioFabricacion, int id,int nRuedas) {
		super(matricula, tamanio, anioFabricacion, id);
		this.nRuedas = nRuedas;
	}

	public int getnRuedas() {
		return nRuedas;
	}

	public void setnRuedas(int nRuedas) {
		this.nRuedas = nRuedas;
	}

	@Override
	public String toString() {
		return super.toString()+"Batmoviles [nRuedas=" + nRuedas + "]";
	}

	@Override
	public double calcularPrecio(double cantidadBat) {
		// TODO Auto-generated method stub
		cantidadBat=1200.5;
		return nRuedas*cantidadBat;
	}
	
	public void avisarMaximo(int minRuedas) {
		if(nRuedas>=minRuedas) {
			System.out.println("Desplegado al máximo");
		}
	}

}
