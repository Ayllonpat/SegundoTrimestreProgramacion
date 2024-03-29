package Ejercicio04;

public class LineaDeVenta {
	
	
	private ProductoGenerico producto;
	private int cantidad;
	private double precioFinal;

	public LineaDeVenta(ProductoGenerico producto, int cantidad ) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public ProductoGenerico getProducto() {
		return producto;
	}

	public void setProducto(ProductoGenerico producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	@Override
	public String toString() {
		return  producto+""+cantidad+"\t\t\t"+precioFinal;
	}
	
	public double calcularTotal() {
		
		precioFinal=producto.calcularPrecio()*cantidad;
		
		return precioFinal;
	}
	
	
	/*public void mostrarLinea() {
		producto="Producto";
		cantidad="Cantidad";
		System.out.println(producto + "\t\t\t"+ cantidad); //cuando cree en principal linea de venta hay q añadirlo como (p1, 2) (producto, cantidad) y los llamas en el array
	}*/
	
	
	
	
}
