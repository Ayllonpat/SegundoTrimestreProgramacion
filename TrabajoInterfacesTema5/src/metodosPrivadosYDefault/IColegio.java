package metodosPrivadosYDefault;

public interface IColegio {
	
	//añade personas
	public void aniadirPersona(Persona p);
	
	//borra peersonas
	public void borrarPersona(Persona p);
	
	//
	public static void mostrarSilencio() {
		
		System.out.println("Todos se callan");
		
	}
	
}
