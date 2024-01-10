package ejemplo1Herencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Las clases heredan TODO menos los constructores
		//Cuando se hereda extiende (ya que tiene lo de la supclase más lo suyo propio)
		//supclase es de la que heredas (padre) y subclase a la que heredas (hijo)
		
		Scanner sc=new Scanner(System.in);
		
		double fijo=1000.0;
		
		Trabajador t1=new Trabajador("Lucia", "CEO", "89641021R");
		Empleado e1=new Empleado("Maria","Encargada", "691234086T", 2100.0, 11.5);
		Empleado e2=new Empleado("9462368F", 1200.2, 15.0);
		Consultor c1=new Consultor("Miguel", "Experto", "649149456G", 23, 13);
		
		System.out.println(t1);
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("-------------------------");
		
		
		System.out.println(t1.calcularPaga());
		System.out.println(e1.calcularPaga());
		System.out.println(c1.calcularPaga());
		
		System.out.println("-------------------------");
		
		
		System.out.println(t1.calcularPagaV2(fijo));
		System.out.println(e1.calcularPagaV2(fijo)); //suma el fijo
		System.out.println(c1.calcularPagaV2(fijo));
		
		System.out.println("-------------------------");
		
		c1.avisarExtras();
		
		System.out.println("-------------------------");
		
		t1.darDeBaja();
		
		System.out.println(t1);
		
		e1.darDeBaja();
		
		System.out.println(e1); //llamamos a un método heredado sin que esté en la clase empleado, solo trabajador
		
	}

}
