package ejercicio02;

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
	
	public void mostrarListaOrdenAnianido() {
		for(Trastero t:listaTrasteros) {
			System.out.println(t);
		}
		
	}

}
