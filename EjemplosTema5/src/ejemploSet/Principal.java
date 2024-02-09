package ejemploSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		Set <String> lista = new HashSet <>();
		
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");
		
		System.out.println(lista);
		
		lista.remove("Tres");
		
		System.out.println(lista);
		
		System.out.println(lista.contains("UNO")); //comprueba si se encuentra
				
	}

}
