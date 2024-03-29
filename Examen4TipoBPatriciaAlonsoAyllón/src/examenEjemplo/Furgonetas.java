package examenEjemplo;

public class Furgonetas extends Vehiculo{
		
	private double longitud;

	public Furgonetas(int minsEstacionado, String matricula, double longitud) {
		super(minsEstacionado, matricula);
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return super.toString()+"Furgonetas [longitud=" + longitud + "]";
	}
	
	public double calcularPrecio(String matricula, Vehiculo vehiculo, double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		double total;
		if(longitud>limiteFurgo){
			total=((longitud-limiteFurgo)*cantPorMetro)+super.calcularPrecio(precioMin,
					limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		}else {
			total=super.calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		}
		return total;
		
	}
	
	
}
