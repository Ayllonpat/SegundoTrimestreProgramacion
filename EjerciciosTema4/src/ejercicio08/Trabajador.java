package ejercicio08;

public class Trabajador implements IImpuesto{
	
	private double porcentajeDeseadoAPagar;

	public Trabajador(double porcentajeDeseadoAPagar) {
		super();
		this.porcentajeDeseadoAPagar = porcentajeDeseadoAPagar;
	}

	public double getPorcentajeDeseadoAPagar() {
		return porcentajeDeseadoAPagar;
	}

	public void setPorcentajeDeseadoAPagar(double porcentajeDeseadoAPagar) {
		this.porcentajeDeseadoAPagar = porcentajeDeseadoAPagar;
	}

	@Override
	public String toString() {
		return "Trabajador [porcentajeDeseadoAPagar=" + porcentajeDeseadoAPagar + "]";
	}

	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		double cien=100;
		double irpf;
		irpf=((sueldo)*porcentajeDeseadoAPagar/cien);		
		return irpf;
	}

}
