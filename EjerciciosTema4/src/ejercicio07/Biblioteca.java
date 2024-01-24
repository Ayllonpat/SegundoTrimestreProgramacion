package ejercicio07;

public class Biblioteca {
	
	public void contarCincuentaLibros(int numRevista) {
		numRevista=20;
		if(numRevista==50) {
			System.out.println("Felicidades ha publicado 50 libros");
		}
	}
	
	public void mostarLista(Publicaciones lista[]) {
		for(int i = 0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}

}
