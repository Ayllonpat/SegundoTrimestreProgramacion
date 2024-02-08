package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> lista = new HashSet <>();
		Set <Persona> listado = new HashSet <>();
		
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");
		
		System.out.println(lista);
		
		lista.remove("Tres");
		
		System.out.println(lista);
		
		System.out.println(lista.contains("UNO")); //comprueba si se encuentra
		
		listado.add(new Persona("Angel", 34, "123a"));
		listado.add(new Persona("Maria", 37, "123b"));
		listado.add(new Persona("Miguel", 67, "123e"));
		
		System.out.println(listado);
		
		Crud c=new Crud(listado);
		
		String dni="123a";
		
		System.out.println(c.buscar(dni));
	}

}
