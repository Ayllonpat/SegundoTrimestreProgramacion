package Ejercicio04;

public class Venta{
	
	//la listadelineadeventa seria un atributo de esta clase
	
	public void generarListaProduuctosVendidos(LineaDeVenta[]lista) {
		
		for(int i = 0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
	/*public double sumar(LineaDeVenta[]lista) {
		for(int i = 0;i<lista.length;i++) {
			precioFinal=;
		}*/

	}
	
	public void generarLineaFinal(LineaDeVenta[]lista) {
		
		double precioTotal=0;
		
		for(int i = 0;i<lista.length;i++) {
			precioTotal=precioTotal+lista[i].calcularTotal();
		}
		System.out.printf("total\t\t\t\t\t\t\t\t\t%.2f",precioTotal);
	}
	
}
