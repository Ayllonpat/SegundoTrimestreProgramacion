package ejercicio08;

public class Producto implements IImpuesto{

	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		double ivaProducto;
		double cien=100;
		ivaProducto=(precio*(iva/cien));
		return ivaProducto;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
