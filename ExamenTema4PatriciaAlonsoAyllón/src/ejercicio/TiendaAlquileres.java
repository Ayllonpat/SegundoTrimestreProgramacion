package ejercicio;

public class TiendaAlquileres {
	
	public double calcularAlquilerVehiculo(Vehiculo lista[], int id){
		
		double precio = 0;
		
		for(int i=0;i<lista.length;i++) {
			if(lista[i].getId()==id) {
				precio=lista[i].calcularPrecio(i);
				return precio;
			}
			
		}
		return precio;
				
	}
	
	public void mostrarPrecio(double precio) {
		System.out.println(precio);
	}
	
	public void mostrarListado(Vehiculo lista[]) {
		
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
			
			if(lista instanceof Batmoviles[]) {
				
				((Batmoviles)lista[i]).avisarMaximo(5);
				
			}
		}
		
	}
	
	public double calcularTotalRecaudado(Vehiculo lista[]) {
		double total=0;
		for(int i=0;i<lista.length;i++) {
			
			total=total+lista[i].calcularPrecio(i);
			
		}
		return total;
	}
	
	public double calcularTotalRecaudadoBat(Vehiculo lista[]) {
		double total=0;
		
		if(lista instanceof Batmoviles[]) {
			
			for(int i=0;i<lista.length;i++) {
		
			((Batmoviles)lista[i]).calcularPrecio(i);
			total=total+lista[i].calcularPrecio(i);
			}
		}
		return total;
	}
	
public double calcularAlquilerVehiculoDias(Vehiculo lista[], int id, int numDias){
		
		double precio = 0;
		
		for(int i=0;i<lista.length;i++) {
			if(lista[i].getId()==id) {
				precio=lista[i].calcularPrecio(i)*numDias;
				return precio;
			}
			
		}
		return precio;
				
	}
	
}
