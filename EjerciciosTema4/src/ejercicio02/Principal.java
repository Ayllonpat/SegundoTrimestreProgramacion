package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que tenga una clase Documento y dos clases hijas, Tarjeta de visita y Carta.
			Crear los métodos necesarios para que, la cabecera de cada tipo de documento se imprima en pantalla
			de una forma diferente, según sus características. Como es un ejemplo académico, podemos hacer los
			métodos de impresión dentro de cada clase. Por ejemplo, el documento genérico solo tiene un pequeño
			encabezado con los datos de la empresa, la tarjeta puede llevar, además, los datos de contacto de una
			persona y la carta, una fecha.
			Crear un main para hacer una prueba con cada método llamado con objetos de las distintas clases.
		 */
		
		Documento d=new Documento("Salesianos", "/Calle Virgen de Lujan", 654548240, "afhjañf@gmail.com");
		TarjetaDeVisita t=new TarjetaDeVisita("Salesianos", "/Calle Virgen de Lujan", 654548240, "afhjañf@gmail.com", "Maria Romero", 22, 46891624, "hdlfaflasd@gmail.com");
		Carta c=new Carta("Salesianos", "/Calle Virgen de Lujan", 654548240, "afhjañf@gmail.com", "23/04/2002", "lhahfhihifhaihvlbshfhafñbvbal");
		
		System.out.println("---------------------");
		System.out.println(d);
		System.out.println(t);
		System.out.println(c);
		System.out.println("*********************");
		d.imprimirDocumento();
		System.out.println("*********************");
		t.imprimirDocumento();
		System.out.println("*********************");
		c.imprimirDocumento();
	}

}
