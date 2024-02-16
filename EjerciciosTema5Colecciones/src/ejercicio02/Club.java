package ejercicio02;

public class Club {
	
	//Atributos
	
		private SociosCrud cs;
		
		
		//Constructor
		
		public Club (SociosCrud cs) {
			
			this.cs = cs;
		}
		
		
		//Getters and Setters
		
		public SociosCrud getCs () {
			
			return cs;
		}
		
		public void setCs (SociosCrud cs) {
			
			this.cs = cs;
		}
		
		
		//Métodos
		
		public double pagarCuota (String dni, double cuota, double descuentoVeterano) {
			
			if (cs.buscarPorDni(dni).isVeterano()) {
				
				return cuota - (cuota * descuentoVeterano / 100);
			}
			
			else {
				
				return cuota;
			}
		}
		
		public double alquilarPista (String dni, double horas, double precioHora, double descuentoVeterano) {
			
			double precioHoraCalculado = precioHora * horas;
			
			if (cs.buscarPorDni(dni).isVeterano()) {
				
				return precioHoraCalculado - (precioHoraCalculado * descuentoVeterano / 100);
			}
			
			else {
				
				return precioHoraCalculado;
			}
			
		};

}
