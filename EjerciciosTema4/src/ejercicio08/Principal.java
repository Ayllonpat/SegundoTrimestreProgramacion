package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que use la siguiente interface con dos clases que la implementen, la clase Producto
			que implemente el primer método y la clase Trabajador que implemente el segundo método (¿Qué habrá que
			hacer con el que no se implementa?), y una clase de prueba para ver los resultados:
				Public interface IImpuesto {
				double calculoIva (double precio, int iva);
				double calculoIrpf (double sueldo);
				}
		 */
		
		Trabajador t=new Trabajador(11);
		Producto p=new Producto();
		System.out.println(t.calculoIrpf(1100));
		System.out.println(p.calculoIva(20, 21));
	}

}
