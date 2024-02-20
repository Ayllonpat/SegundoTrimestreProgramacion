package examenEjemplo;

import java.util.Arrays;

public class Parking {
	
	private String direccion;
	private Vehiculo []lista;
	
	public Parking(String direccion, Vehiculo []lista) {
		super();
		this.direccion = direccion;
		this.lista = lista;
	}
	
	public Parking() {
		super();
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Vehiculo[] getLista() {
		return lista;
	}
	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "Parking [direccion=" + direccion + ", lista=" + Arrays.toString(lista) + "]";
	}
	
	public void mostrarLista() {
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
	
	public Vehiculo buscar(String matricula) {
		Vehiculo vehiculo = null;
		for(int i=0;i<lista.length;i++) {
			
			if(lista[i].getMatricula().equals(matricula)) {
				lista[i]=vehiculo;
				
			}
		}return vehiculo;
	}
	
	/*public double calcularPrecio(String matricula, double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		double precio;
		
		//precio=calcularPrecio(matricula, precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv).buscar(matricula)
		return precio;
	}*/

}
