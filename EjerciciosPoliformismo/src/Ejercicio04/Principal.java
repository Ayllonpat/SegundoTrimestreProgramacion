package Ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que imprima un ticket de compra, basándonos en
			un supermercado. Debemos crear la clase Producto genérica y tres
			hijas con un atributo más cada una (Alimentación y Electrónica). Cada
			Producto genérico deberá estar caracterizado por el precio unitario,
			nombre, código de identificación, etc.
			El precio de los productos de electrónica lleva un impuesto especial
			por ser de lujo y la alimentación un descuento cuando le quedan menos
			de 2 días para caducar.
			La clase Línea de venta, con un producto y una cantidad como
			atributos y la clase Venta con un array de líneas de venta.
			El ticket debe mostrar una venta completa con varios productos y
			varias cantidades. Se pueden crear los productos directamente en el
			main antes de empezar.
			Agregar un método solo en la clase alimentación, que avise si al
			producto le quedan menos de 2 días para caducar.
			Crear un main, donde crearemos directamente los objetos necesarios. Solo habrá la opción imprimir
			ticket y listar todos los productos guardados, avisando cuando a un producto de alimentación le falten
			menos de dos días para caducar.
		 */
		Venta v = new Venta();
		ProductoGenerico p1=new Alimentacion(2.5, "macarrones", 345, 1, 5, 20, 2, 2);
		ProductoGenerico p2=new Alimentacion(3.4, "arroz", 356, 1, 4, 0, 3, 2);
		ProductoGenerico p3=new Electronica(45, "reloj", 567, 2, 1, 21);
		
		int tam=3;
		
		p1.calcularPrecio();
		p2.calcularPrecio();
		p3.calcularPrecio();
		
		LineaDeVenta l1=new LineaDeVenta(p1, 2);
		LineaDeVenta l2=new LineaDeVenta(p2, 3);
		LineaDeVenta l3=new LineaDeVenta(p3, 1);
		
		LineaDeVenta[]lista = new LineaDeVenta[tam];
		
		lista[0]=l1;
		lista[1]=l2;
		lista[2]=l3;
		
		v.generarListaProduuctosVendidos(lista);
		
		
		
		
	}
}
