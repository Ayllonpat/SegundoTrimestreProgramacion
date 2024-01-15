package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Los vehículos a motor pagan un determinado impuesto de circulación. La cantidad a pagar depende
			de la cilindrada, potencia en caballos y categoría de emisiones contaminantes (cero emisiones, ECO,
			tipo B y tipo C). Crear un programa para calcular la cantidad que debe pagar un vehículo dependiendo
			de sus características. (Los vehículos a motor pueden ser motocicletas, coches y furgonetas).
			El impuesto se calcula con una cantidad fija cuyo valor depende del tipo de emisiones por el simple
			hecho de ser un vehículo con motor más:
			- El 60 % de la cilindrada en el caso de las motocicletas.
			- Otra cantidad fija a las furgonetas por ser transporte de mercancías.
			- El 25 % de la potencia en el caso de los coches.
			La jerarquía de clases no tiene mucho sentido en este ejemplo, pero está puesto para reescribir métodos.
			Probar todo en un main sencillo.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		
		
		//escribir atributos
		Coches c=new Coches(1, 120, 160, 50);
		Motocicletas m=new Motocicletas(2, 69, 120, 45);
		Furgonetas f=new Furgonetas(3, 250, 100, 15);
		
		
		System.out.println(c);
		System.out.println(m);
		System.out.println(f);
		double fijo;
		System.out.println("-------------------------------------------");
		fijo=c.calcularFijo();
		System.out.println(c.calcularImpuesto(fijo));
		fijo=m.calcularFijo();
		System.out.println(m.calcularImpuesto(fijo));
		fijo=f.calcularFijo();
		System.out.println(f.calcularImpuesto(fijo));
		
		

	}

}
