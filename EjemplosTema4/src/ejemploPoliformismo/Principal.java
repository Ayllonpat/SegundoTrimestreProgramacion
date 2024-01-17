package ejemploPoliformismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacionesFiguras op= new OperacionesFiguras();
		Cuadrado c = new Cuadrado ("Cuadrado 1", "Negro", 2);
		
		Figura f1= new Cuadrado ("Segundo cuadrado", "verde", 2.0); //no podria ser new figura pq seria abstracta
		Figura f2= new Circulo ("Segundo círculo", "Amarillo", 2.0);
		
		//listado figuras
		
		int tam=3;
		
		Figura[] lista = new Figura[tam];
		
		lista[0]=c;
		lista[1]=f1;
		lista[2]=f2;
		
		//imprimir
		
		System.out.printf("El area es %.2f", op.calcularAreaUnaFiguta(c));
		
		System.out.println("********************************************");
		
		System.out.println(f1); 
		System.out.println(f2);
		System.out.println("*********Áreas**********");
		System.out.println("Usan el método de cada clase concreta porque está sobrescrito");
		System.out.println("Área del segundo cuadrado: "+f1.calcularArea());
		System.out.printf("Perímetro del segundo círculo: %.2f",f2.calcularArea());
		
		System.out.println("\n-----------------------------------------");
		
		System.out.println(op.sumarAreas(lista));

	}

}
