package ejercicio03;

public class CrudCurso {

	/*
	 * no es crud por lo que hay que declarar un objeto CrudAlumno ca;
	 */
	CrudAlumno ca;

	public CrudCurso(CrudAlumno ca) {
		super();
		this.ca = ca;
	}

	public CrudAlumno getCa() {
		return ca;
	}

	public void setCa(CrudAlumno ca) {
		this.ca = ca;
	}

	@Override
	public String toString() {
		return "CrudCurso [ca=" + ca + "]";
	}
	
	public double calcularMediaCurso(String curso) {
		
	}
}
