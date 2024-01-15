package ejemploPoliformismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacionesFiguras op= new OperacionesFiguras();
		Cuadrado c = new Cuadrado ("Cuadrado 1", "Negro", 2);
		
		System.out.printf("El area es %.2f", op.calcularAreaUnaFiguta(c));
		
		System.out.println("********************************************");
		
		Figura f1= new Cuadrado ("Segundo cuadrado", "verde", 2.0);
		Figura f2= new Circulo ("Segundo círculo", "Amarillo", 2.0);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("*********Áreas**********");
		System.out.println("Usan el método de cada clase concreta porque está sobrescrito");
		System.out.println("Área del segundo cuadrado: "+f1.calcularArea());
		System.out.printf("Perímetro del segundo círculo: %.2f",f2.calcularArea());

	}

}
