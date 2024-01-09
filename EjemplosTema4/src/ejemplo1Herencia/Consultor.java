package ejemplo1Herencia;

public class Consultor extends Trabajador {
	
	private int horas;
	private double tarifa;
	
	
	public Consultor(String nombre, String puesto, String dni, int horas, double tarifa) {
		super(nombre, puesto, dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getTarifa() {
		return tarifa;
	}


	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}


	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	public double calcularPaga() {
		return tarifa*horas;
	}
	
	public double calcularPagaV2(double fijo) { //si la madre tiene un parámetro auqnue no se use hay q pasarlo
		double total=0.0;
		total= super.calcularPagaV2(fijo)+ tarifa*horas;
		return total;
	}
	
	public void avisarExtras() {
		if(horas>=40) {
			
			System.out.println("Ha pasado las horas");
			
		}
	}

}
