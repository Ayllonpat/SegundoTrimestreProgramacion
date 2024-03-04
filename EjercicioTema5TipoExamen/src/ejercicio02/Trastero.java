package ejercicio02;

public class Trastero implements Comparable<Trastero>{
	
	private double m2;
	private String direccion;
	private int nTrastero;
	private double precio;
	private boolean ocupado;
	
	public Trastero(double m2, String direccion, int nTrastero, double precio, boolean ocupado) {
		super();
		this.m2 = m2;
		this.direccion = direccion;
		this.nTrastero = nTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}
	
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getnTrastero() {
		return nTrastero;
	}
	public void setnTrastero(int nTrastero) {
		this.nTrastero = nTrastero;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	@Override
	public String toString() {
		return "Trastero [m2=" + m2 + ", direccion=" + direccion + ", nTrastero=" + nTrastero + ", precio=" + precio
				+ ", ocupado=" + ocupado + "]";
	}

	@Override
	public int compareTo(Trastero o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
