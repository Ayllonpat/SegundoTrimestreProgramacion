package ejercicio07;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam =2;
		
		Publicaciones p1=new Libros("Hadas", "Marisa Meyes", "Salamandra", 2012, 520, true, "Fantasia");
		Publicaciones p2= new Libros("Memorias", "Sanderson", "Salamandra", 2001, 831, false, "fantasia");
		
		Publicaciones []lista=new Publicaciones[tam];
		
		lista[0]=p1;
		lista[1]=p2;
		
		Biblioteca b=new Biblioteca();
		
		b.mostarLista(lista);
		
		b.contarCincuentaLibros(tam);
		
		p1.contarPrestados(lista);
		

	}

}
