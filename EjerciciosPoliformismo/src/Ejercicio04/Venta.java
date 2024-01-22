package Ejercicio04;

public class Venta{
	
	private double suma;
	
	public double getSuma() {
		return suma;
	}


	public void setSuma(double suma) {
		this.suma = suma;
	}

	public void generarListaProduuctosVendidos(LineaDeVenta[]lista) {
		
		for(int i = 0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
	}
	

}
