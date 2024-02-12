package examenEjemplo;

public class Vehiculo implements IAparcamiento{
	
	private int minsEstacionado;

	public Vehiculo(int minsEstacionado) {
		super();
		this.minsEstacionado = minsEstacionado;
	}

	public int getMinsEstacionado() {
		return minsEstacionado;
	}

	public void setMinsEstacionado(int minsEstacionado) {
		this.minsEstacionado = minsEstacionado;
	}

	@Override
	public String toString() {
		return "Vehiculo [minsEstacionado=" + minsEstacionado + "]";
	}

	@Override
	public double calcularPrecio(double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		// TODO Auto-generated method stub
		double total=0;
		total=minsEstacionado*precioMin;
		return total;
	}
	
	
}
