package ejercicio05;

public class Oficina {
	
	public void generarListaEmpleados(Empleados[]lista) {
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
			
			if(lista[i] instanceof Vendedor) {
			((Vendedor)lista[i]).mostraFelicitacion();
			}
		}
	}

}
