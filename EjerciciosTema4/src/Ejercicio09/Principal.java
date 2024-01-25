package Ejercicio09;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Construir una clase ArrayReales que declare un atributo de tipo double[] num, lo rellene aleatoriamente y
				que implemente una interfaz llamada Estadisticas. El contenido de esta interfaz es el siguiente:
				public interface Estadisticas {
				double calcularMinimo( );//Devuelve el menor número del array
				double calcularMaximo( );//Devuelve el mayor número en el array
				double calcularSumatorio( );//Devuelve la suma de los elementos del array
				}
		 */
		
		Random rnd=new Random(System.nanoTime());
		
		int tam=3;
		
		double desde=0.0;
		double hasta=100.0;
		ArrayReales[] num=new ArrayReales[tam];
		ArrayReales a=new ArrayReales(num);
		ArrayReales r1= new ArrayReales(rnd.nextDouble(hasta-desde+1)+desde);
		ArrayReales r2= new ArrayReales(rnd.nextDouble(hasta-desde+1)+desde);
		ArrayReales r3= new ArrayReales(rnd.nextDouble(hasta-desde+1)+desde);
		
		num[0]=r1;
		num[1]=r2;
		num[2]=r3;
		
		a.mostrarLista(num);
		
		System.out.println(a.calcularMaximo(num));
		System.out.println(a.calcularMinimo(num));
		System.out.println(a.calcularSumatorio(num));
		
	}

}
