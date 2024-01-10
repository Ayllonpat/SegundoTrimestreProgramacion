package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crear un programa con una clase Ordenador que permita modelar uno con características como
			capacidad de disco duro, frecuencia del procesador, precio base y marca. Crear dos clases hijas,
			llamadas Sobremesa y Portátil. Añadir a Sobremesa el atributo precioMontaje y al portátil otro atributo
			que será un booleno por si se quiere o no seguro para la pantalla y otro con la cantidad a pagar por
			dicho seguro.
			La clase madre debe tener un método para calcular el precio de venta al público aplicando un % de
			ganancia del vendedor al precio base. Este método se debe reescribir en las clases hijas sumando la
			cantidad adecuada en el caso del montaje o la cantidad del seguro solo si el cliente lo quiere contratar.
			Crear un main sencillo (no es necesario crear menú) para comprobar todo, basta llamar a los métodos
			en orden adecuado y mostrar el resultado de los cálculos que hace cada uno, es decir, el precio de venta
			al público de un objeto de cada subtipo (uno de sobremesa y un portátil).
		 */

		Ordenador o=new Ordenador(256, 120, 560, "Lenovo");
		Sobremesa s=new Sobremesa(256, 120, 560, "Lenovo", 34);
		Portatil p=new Portatil(256, 120, 560, "Lenovo", true, 75);
		
		System.out.println("------------------------");
		System.out.println(o);
		System.out.println(s);
		System.out.println(p);
		System.out.println("------------------------");
		System.out.println(o.calcularPrecioPublico());
		System.out.println(s.calcularPrecioPublico());
		System.out.println(p.calcularPrecioPublico());
	}
	
}
