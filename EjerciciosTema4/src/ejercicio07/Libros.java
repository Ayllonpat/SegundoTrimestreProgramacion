package ejercicio07;

public class Libros extends Publicaciones{

	private String genero;
	
	public Libros(String titulo, String autor, String editorial, int anioPublicacion, int numPaginas, boolean prestado,
			String genero) {
		super(titulo, autor, editorial, anioPublicacion, numPaginas, prestado);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return super.toString()+"Libros [genero=" + genero + "]";
	}

	@Override
	public int contarPrestados(Publicaciones[] lista) {
		// TODO Auto-generated method stub
		
		int contadorPrestados=0;
		
		for(int i=0;i<lista.length;i++) {
			if(lista[i] != null) {
				if(lista[i].isPrestado()) {
					contadorPrestados++;
				}
			}
		}
		
		return contadorPrestados;
	}

	@Override
	public int contarPublicacionesAnterioresA(Publicaciones[] lista, int anio) {
		// TODO Auto-generated method stub
		int contador=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i] != null) {
				if(lista[i].getAnioPublicacion()<2020) {
					contador++;
					}
				}
			}
		return contador;
	}


}
