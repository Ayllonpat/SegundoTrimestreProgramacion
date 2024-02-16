package ejercicio02;

import java.util.Iterator;
import java.util.List;

public class SociosCrud {
	
	//Atributos
	
		private List<Socios> listaSocios;
		
		
		//Constructor
		
			public SociosCrud (List<Socios> listaSocios) {
				
				this.listaSocios = listaSocios;
			}
			
			//Getters and Setters
			
			public List<Socios> getListaSocios () {
				
				return listaSocios;
			}
			
			public void setListaSocios (List<Socios> listaSocios) {
				
				this.listaSocios = listaSocios;
			}
			
			
			//Métodos
			
			public void listarSocios () {
				
				for (Socios socio : listaSocios) {
					
					System.out.println(socio);
				}
			}
			
			public void agregarSocio (Socios s) {
				
				listaSocios.add(s);
			}
			
			public Socios buscarPorDni (String dni) {
				
				boolean encontrado = false;
				Socios s = null;
				
				for (int i = 0; i < listaSocios.size() && !encontrado ; i++) {
					
					if (listaSocios.get(i).getDni().equals(dni)) {
						
						s = listaSocios.get(i);
						
						encontrado = true;
					}
				}
				
				return s;
			}
			
			public void modificarSocio (Socios s, String nombre, String apellidos, boolean veterano) {
				
				s.setNombre(nombre);
				s.setApellidos(apellidos);
				s.setVeterano(veterano);
				
			}
			
			public void eliminarSocio (Socios s) {
				
				listaSocios.remove(s);
			}
	
}
