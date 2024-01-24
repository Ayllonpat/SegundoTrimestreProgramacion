package ejercicio07;

public abstract class Publicaciones implements IPublicaciones{
	
	private String titulo;
	private String autor;
	private String editorial;
	private int anioPublicacion;
	private int numPaginas;
	private boolean prestado;
	
	public Publicaciones(String titulo, String autor, String editorial, int anioPublicacion, int numPaginas,
			boolean prestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.anioPublicacion = anioPublicacion;
		this.numPaginas = numPaginas;
		this.prestado = prestado;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	@Override
	public String toString() {
		return "Publicaciones [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", anioPublicacion=" + anioPublicacion + ", numPaginas=" + numPaginas + ", prestado=" + prestado
				+ "]";
	}

	@Override
	public abstract int contarPrestados(Publicaciones[] lista);

	@Override
	public abstract int contarPublicacionesAnterioresA(Publicaciones[] lista, int anio);
	
	

}
