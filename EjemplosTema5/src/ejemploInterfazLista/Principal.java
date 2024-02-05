package ejemploInterfazLista;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Persona> lista=new ArrayList <Persona> ();
		
		Persona p=new Persona("Lucas", 65, "45676543R");
		
		lista.add(new Persona("Angel", 36, "34567823E"));
		lista.add(p);
		lista.add(new Persona("Maria", 26, "34567823H"));
		
		System.out.println(lista);
		
		CrudPersona cp=new CrudPersona(lista);
		
		System.out.println("-------------------------------------");
		
		cp.mostrarLista();

	}

}
