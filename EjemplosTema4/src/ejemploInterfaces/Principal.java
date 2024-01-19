package ejemploInterfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Animal a = new Animal("programador", 2);
			a.cazar(a);
			
			Persona p=new Persona("Luismi", 34);
			p.localizar(a);
			
			a.huir();
	}

}
