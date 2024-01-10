package ejercicio02;

public class Carta extends Documento{
	
	private String fecha;
	private String texto;
	
	public Carta(String nombreEmpresa, String direccionEmpresa, int nEmpresa, String correoEmpresa, String fecha,
			String texto) {
		super(nombreEmpresa, direccionEmpresa, nEmpresa, correoEmpresa);
		this.fecha = fecha;
		this.texto = texto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return super.toString() + "Carta [fecha=" + fecha + ", texto=" + texto + "]";
	}
	
	public void imprimirDocumento() {
		super.imprimirDocumento();
		System.out.println(fecha);
		System.out.println(texto);
	}
	
}
