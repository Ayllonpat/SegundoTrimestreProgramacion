package ejercicio02;

public class Documento {
	
	private String nombreEmpresa;
	private String direccionEmpresa;
	private int nEmpresa;
	private String correoEmpresa;
	
	public Documento(String nombreEmpresa, String direccionEmpresa, int nEmpresa, String correoEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.nEmpresa = nEmpresa;
		this.correoEmpresa = correoEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public int getnEmpresa() {
		return nEmpresa;
	}

	public void setnEmpresa(int nEmpresa) {
		this.nEmpresa = nEmpresa;
	}

	public String getCorreoEmpresa() {
		return correoEmpresa;
	}

	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}

	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", direccionEmpresa=" + direccionEmpresa + ", nEmpresa="
				+ nEmpresa + ", correoEmpresa=" + correoEmpresa + "]";
	}
	
	public void imprimirDocumento() {
		System.out.println("----------------------------------------------------");
		System.out.println("\t\t"+nombreEmpresa);
		System.out.println("----------------------------------------------------\n");
		
		System.out.println(direccionEmpresa);
		System.out.println(nEmpresa);
		System.out.println(correoEmpresa);
		System.out.println("-----------------------------------------------------\n");
	}

}
