package metodosPrivadosYDefault;

public interface IColegio {
	
	//cuenta el número de personas que entran en el colegio
	public void entrarColegio();
	
	//cuenta la gente que sale del colegio(restas)
	public void salirColegio();
	
	public static void mantenerSilencio() {
		
		System.out.println("Todos se callan");
		
	}
	
}
