package examen;

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
			if(lista[i] instanceof Furgonetas) {
				((Furgonetas)lista[i]).mostrarParkingEspecial();
			}
		}
	}
	
	public Vehiculo buscar(String matricula) {
		Vehiculo vehiculo = null;
		boolean encontrado = false;
		for(int i=0;i<lista.length && !encontrado ;i++) {			
			if(lista[i].getMatricula().equals(matricula)) {
				vehiculo=lista[i];	
			}
		}return vehiculo;
	}
	
	public double calcularPrecio(String matricula, double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		double precio;
		
		precio=buscar(matricula).calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		return precio;
	}
	
	public double calcularPrecioMotos(double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		double recaudadoMotos=0;
		
		for(int i=0;i<lista.length;i++) {
		
			if(lista[i] instanceof Motos) {
				recaudadoMotos=((Motos)lista[i]).calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
			}
		}
		return recaudadoMotos;
	}
	
	public double calcularPrecioNavidad(String matricula, double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv, double sumaNavidad) {
		double precio;
		
		precio=buscar(matricula).calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		return precio+sumaNavidad;
	}
}
