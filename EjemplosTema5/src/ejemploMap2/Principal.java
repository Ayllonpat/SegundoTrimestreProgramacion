package ejemploMap2;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//<numero de clase, alumno>
		
		Map<Integer, Alumno> lista2=new HashMap <>();
		Alumno a=new Alumno (2, "Maria", 5.6);
		lista2.put(6, a);
		lista2.put(1, new Alumno (1, "Ángel", 3.2));
		System.out.println(lista2);
		a.setNombre("Iván"); //modifica
		System.out.println(lista2);
	}

}
