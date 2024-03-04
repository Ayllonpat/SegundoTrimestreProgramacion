package ejercicio02;

import java.util.Comparator;

public class ComparaPorNumero implements Comparator<Trastero>{

	@Override
	public int compare(Trastero n1, Trastero n2) {
		// TODO Auto-generated method stub
		
		int numero1= n1.getnTrastero();
		int numero2= n2.getnTrastero();
		
		if(numero1<numero2) {
			return -1;
		}else {
			if(numero1>numero2) {
				return 1;
			}return 0;
		}
		
		
	}

}
