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

}
