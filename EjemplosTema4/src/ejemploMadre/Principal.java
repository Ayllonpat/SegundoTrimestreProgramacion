package ejemploMadre;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int atributo1;
		int atributo2;
		
		Madre m=new Madre(1);
		Hija h=new Hija(2, 2);
		
		System.out.println(m);
		System.out.println(h);
		
		System.out.println(m.metodo1());
		System.out.println(h.metodo1());

	}

}
