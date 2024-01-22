package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear una clase Empleado con los atributos nombre, apellidos, sueldo base y nº de Empleado.
			Introducir los métodos necesarios y oportunos.
			Crear una clase derivada de ella, llamada Vendedor que tenga como atributos la cantidad de ventas y
			un incentivo (un porcentaje de las ventas realizadas en un mes sumado a su sueldo base) y los métodos
			apropiados para manejarla.
			Otra clase hija puede ser Gerente, cuyo sueldo es el base, pero al que se le quita un % de impuestos
			(consideraremos que al vendedor no se le quita nada para que el ejercicio tenga algo más de sentido).
			Crear una clase Oficina caracterizada por una lista de Empleados donde se incluya un método que
			calcule el sueldo de un empleado pasándole como parámetro un empleado y otro método que calcule
			lo gastado por la oficina en total por el pago de sueldos a todos los empleados.
			Probar el programa en una clase principal, instanciando un array de empleados guardando varios tipos
			incluyendo un empleado genérico y mostrando su sueldo. Si el empleado es un vendedor se le debe
			felicitar con un mensaje por pantalla cuando haya vendido más de una cantidad pasada como parámetro
			que será su objetivo de ventas.
		 */
		
		Oficina o=new Oficina();
		
		Empleados e1 = new Vendedor("Maria", "Martin", 1400, 1, 11, 11, 10000);
		Empleados e2 = new Vendedor("David", "Ortega", 1400, 2, 9, 11, 9000);
		Empleados e3 = new Gerente("Sofia", "Romano", 1600, 3, 15);
		
		int tam = 3;
		
		e1.calcularSueldo();
		e2.calcularSueldo();
		e3.calcularSueldo();
		
		Empleados[] lista= new Empleados[tam];
		
		lista[0]=e1;
		lista[1]=e2;
		lista[2]=e3;
		
		o.generarListaEmpleados(lista);

	}

}
