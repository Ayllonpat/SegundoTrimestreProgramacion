package ejercicio;

import java.util.Comparator;

public class OrdenarPorPuntuacion implements Comparator<Carta>{

	@Override
	public int compare(Carta c1, Carta c2) {
		// TODO Auto-generated method stub
		int carta1=c1.devolverValorCarta(c1);
		int carta2=c2.devolverValorCarta(c2);
		
		if(carta1>carta2) {
			return -1;
		}else if(carta1<carta2) {
			return 1;
		}else {
			return 0;
			}
	}

}
