package Ejercicio04;

public class LineaDeVenta{
	
	
	private String producto;
	private String cantidad;

	public LineaDeVenta(String producto, String cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaDeVenta [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	public void mostrarLinea() {
		producto="Producto";
		cantidad="Cantidad";
		System.out.println(producto + "\t\t\t"+ cantidad); //cuando cree en principal linea de venta hay q añadirlo como (p1, 2) (producto, cantidad) y los llamas en el array
	}
	
	
	
	
}
