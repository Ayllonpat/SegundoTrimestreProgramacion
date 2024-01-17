package ejemploPoliformismo;

public class OperacionesFiguras {
	
	public double calcularAreaUnaFiguta(Figura f) {
		
		return f.calcularArea();	
	}
	
	public double sumarAreas(Figura[]lista) {
		
		double resultado = 0;
		
		for(int i = 0;i<lista.length;i++) {
			resultado = resultado + calcularAreaUnaFiguta(lista[i]);
			//resultado = resultado +lista[i].calcularArea();
		}
		return resultado;
	}
	
	public double sumarAreasConAviso(Figura[]lista) {
		
		double resultado = 0;
		
		for(int i = 0;i<lista.length;i++) {
			resultado = resultado + calcularAreaUnaFiguta(lista[i]);
			
			if(lista[i] instanceof Circulo) { //solo mira en la lista los objetos instanciados como circulo (no tiene pq ser tipo circulo ya que instanciado es a la derecha y el tipo es el de la izquierda
				((Circulo)lista[i]).mostrarRadianes();//si es tipo figura(la lista es tipo figura) no reconoce mostrarRadianes asi que hay que cambiar el tipo a circulo
				//delante de la lista (Circulo) para obligarle a ser tipo circulo
			}
			
		}
		return resultado;
	}
	

}
