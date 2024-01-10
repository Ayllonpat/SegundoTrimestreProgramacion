package ejercicio02;

public class TarjetaDeVisita extends Documento{
	
	private String nombrePersona;
	private int edad;
	private int nTelefonoPersona;
	private String correoPersona;
	
	public TarjetaDeVisita(String nombreEmpresa, String direccionEmpresa, int nEmpresa, String correoEmpresa,
			String nombrePersona, int edad, int nTelefonoPersona, String correoPersona) {
		super(nombreEmpresa, direccionEmpresa, nEmpresa, correoEmpresa);
		this.nombrePersona = nombrePersona;
		this.edad = edad;
		this.nTelefonoPersona = nTelefonoPersona;
		this.correoPersona = correoPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getnTelefonoPersona() {
		return nTelefonoPersona;
	}

	public void setnTelefonoPersona(int nTelefonoPersona) {
		this.nTelefonoPersona = nTelefonoPersona;
	}

	public String getCorreoPersona() {
		return correoPersona;
	}

	public void setCorreoPersona(String correoPersona) {
		this.correoPersona = correoPersona;
	}

	@Override
	public String toString() {
		return super.toString() + "TarjetaDeVisita [nombrePersona=" + nombrePersona + ", edad=" + edad + ", nTelefonoPersona="
				+ nTelefonoPersona + ", correoPersona=" + correoPersona + "]";
	}
	
	public void imprimirDocumento() {
		super.imprimirDocumento();
		System.out.println(nombrePersona);
		System.out.println(edad);
		System.out.println(nTelefonoPersona);
		System.out.println(correoPersona);
	}
	
	

}
