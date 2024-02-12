package ejemploMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, String> lista= new HashMap <String, String> (); //en los map hay que poner el tipo de la clave y el valor, no se puede declarar map pq es una interfaz
		Set <String> listaClaves= lista.keySet(); //se crea una lista de claves que llame solo a las claves
		Collection <String> listaValores=lista.values(); //para imprimir los valores se debe utilizar collection
		
		Set<Entry<String,String>>lista2 = lista .entrySet();//hay q imporatar bn
		
		lista.put("one", "1st"); //en map en vez de add se añade con put
		lista.put("two", "2sd");
		lista.put("three", "3rd");
		lista.put("one", "uno"); //machaca la clave anterior (cambia el valor)
		lista.put("uno", "1st"); //no importa que se repitan valores
		
		System.out.println(lista);
		System.out.println(listaClaves);
		System.out.println(listaValores);
		System.out.println(lista2);
	}

}
