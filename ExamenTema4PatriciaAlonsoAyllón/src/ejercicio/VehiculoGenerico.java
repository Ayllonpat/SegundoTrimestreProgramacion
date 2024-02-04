package ejercicio;

public class VehiculoGenerico extends Vehiculo{

	public VehiculoGenerico(String matricula, double tamanio, int anioFabricacion, int id) {
		super(matricula, tamanio, anioFabricacion, id);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return super.toString()+"VehiculoGenerico []";
	}


	@Override
	public double calcularPrecio(double cantidadBat) {
		// TODO Auto-generated method stub
		double cien=100;
		return (getTamanio()*getAnioFabricacion())/cien;
	}

}
