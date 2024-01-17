package Ejercicio04;

public abstract class ProductoGenerico {
	
	private double precioUnitario;
	private String nombreProducto;
	private int codProducto;
	private int codDepartamento;
	private int cantidadAComprar;
	
	public ProductoGenerico(double precioUnitario, String nombreProducto, int codProducto, int codDepartamento,
			int cantidadAComprar, double precioAlterado) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombreProducto = nombreProducto;
		this.codProducto = codProducto;
		this.codDepartamento = codDepartamento;
		this.cantidadAComprar = cantidadAComprar;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public int getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(int codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public int getCantidadAComprar() {
		return cantidadAComprar;
	}

	public void setCantidadAComprar(int cantidadAComprar) {
		this.cantidadAComprar = cantidadAComprar;
	}

	@Override
	public String toString() {
		return "ProductoGenerico [precioUnitario=" + precioUnitario + ", nombreProducto=" + nombreProducto
				+ ", codProducto=" + codProducto + ", codDepartamento=" + codDepartamento + cantidadAComprar +"]";
	}
	
	public abstract double calcularPrecio();
	
	
}
