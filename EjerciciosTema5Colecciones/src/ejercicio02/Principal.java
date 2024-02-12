package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un programa para gestionar los socios de un Club de campo. Se debe poder guardar Socios con
			sus datos personales, buscarlos, mostrar sus datos, modificarlos y borrarlos (operaciones CRUD). Usar
			la clase ArrayList. Este ejercicio es para empezar, así que no es necesario hacer nada más, aunque se
			podrían agregar funcionalidades como alquilar pistas, pagar cuotas, etc.
			Debemos usar la clase Socio, la clase Club y la principal como mínimo. Puedes probar a separar "las
			operaciones CRUD" en una clase CRUDSocio de la clase Club.
		 */
		
		List <Socios> listaSocios=new ArrayList <Socios> ();
		SociosCrud cs= new SociosCrud();
	}

}
