package ejercicio02;

import java.util.Collections;
import java.util.List;

public class Oficina {
	
	private List<Trastero> listaTrasteros;

	public Oficina(List<Trastero> listaTrasteros) {
		super();
		this.listaTrasteros = listaTrasteros;
	}

	public List<Trastero> getListaTrasteros() {
		return listaTrasteros;
	}

	public void setListaTrasteros(List<Trastero> listaTrasteros) {
		this.listaTrasteros = listaTrasteros;
	}

	@Override
	public String toString() {
		return "Oficina [listaTrasteros=" + listaTrasteros + "]";
	}
	
	public void mostrarListaOrdenAnianido() {//ordenarPorAnianido
		Collections.sort(listaTrasteros);
		
		
	}
	
	public void mostrarListaPrecio() {
		Collections.sort(listaTrasteros, new ComparaPorPrecio().reversed());
		for(Trastero t:listaTrasteros) {
			System.out.println(t);
		}
	}
	
	public void mostrarListaNumero() {
		Collections.sort(listaTrasteros, new ComparaPorNumero());
		for(Trastero t:listaTrasteros) {
			System.out.println(t);
		}
	}
	
	public Trastero buscarPorPrecio(double precio) {
		int i=0;
		boolean encontrado=false;
		
		for(Trastero t:listaTrasteros) {
			Trastero lista=listaTrasteros.get(i);
			if(precio==lista.getPrecio()){
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) 
			return listaTrasteros.get(i);
		else 
			return null;	
	}
	//public List<Trastero> buscarPorPrecio(double precio){
	// List<Trastero> listaPrecio=new ArrayList<Trastero>();
		//for(Trastero t:listaTrastero){
			//if(trastero.getPrecio()==precio){
				//listaPrecio.add(trastero)
			//}
		//}
	//}
	public Trastero buscarPorNumero(int nTrastero) {
		int i=0;
		boolean encontrado=false;
		
		for(Trastero t:listaTrasteros) {
			Trastero lista=listaTrasteros.get(i);
			if(nTrastero==lista.getnTrastero()) {
				encontrado=true;
			}else {
				i++;
			}
		}
			if(encontrado)
				return listaTrasteros.get(i);
			else
				return null;
	}
	
	public Trastero buscarPorMayorPrecio() {
		int i=0;
		double precio=0;
		
		for(Trastero t:listaTrasteros) {
			Trastero lista=listaTrasteros.get(i);
			if(precio<=lista.getPrecio()) {
				precio=lista.getPrecio();
				i++;
			}else {
				i++;
			}
		}
		return buscarPorPrecio(precio);
	}
	
	public void agregar(Trastero t) {
		listaTrasteros.add(t);
	}
	
	public void borrar(int nTrastero) {
		if(buscarPorNumero(nTrastero)!=null) {
			listaTrasteros.remove(nTrastero);
		}
		
	}
	
	public Trastero editar(int nTrastero, double m2, String direccion, int nTrasteroNuevo, double precio, boolean ocupado) {
		if(buscarPorNumero(nTrastero)!=null) {
		buscarPorNumero(nTrastero).setM2(m2);
		buscarPorNumero(nTrastero).setDireccion(direccion);
		buscarPorNumero(nTrastero).setnTrastero(nTrasteroNuevo);
		buscarPorNumero(nTrastero).setPrecio(precio);
		buscarPorNumero(nTrastero).setOcupado(ocupado);
		}
		return buscarPorNumero(nTrasteroNuevo);
	}
	
	public void mostrarTrasterosVacios() {
		int i=0;
		for(Trastero t:listaTrasteros) {
			Trastero lista=listaTrasteros.get(i);
			if(lista.isOcupado()) {
				i++;
			}else {
				System.out.println(listaTrasteros.get(i));
				i++;
			}
		}
	}

}
