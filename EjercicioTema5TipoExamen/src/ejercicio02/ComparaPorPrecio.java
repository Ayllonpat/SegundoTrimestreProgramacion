package ejercicio02;

import java.util.Comparator;

public class ComparaPorPrecio implements Comparator<Trastero>{

	@Override
	public int compare(Trastero p1, Trastero p2) {
		// TODO Auto-generated method stub
		
		double precio1=p1.getPrecio();
		double precio2=p2.getPrecio();
		
		if(precio1<precio2) {
			return -1;
		}else {
			if (precio1 > precio2) {
				return 1;
			}
			return 0;
		}
	}
}
