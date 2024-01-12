package ejemploAbstracto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrados c1=new Cuadrados(2,3, 7);
		
		Figura c=new Cuadrados(1, 2, 3);//no se pueden instanciar objetos de la clase figura pq es abstracta asi que hay que hacerlo desde las hijas
		//es un tipo figura pero que se comparta como un cuadrado
		System.out.println(c.calcularArea());
		
		
		Rectangulo r=new Rectangulo(5, 8, 1, 3);
	}

}
