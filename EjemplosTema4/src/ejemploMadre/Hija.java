package ejemploMadre;

public class Hija extends Madre{

	

	private int atributo2=2;
	
	public Hija(int atributo1, int atributo2) {
		super(atributo1);
		this.atributo2=atributo2;
	}

	public int getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}

	

	@Override
	public String toString() {
		return super.toString()+"Hija [atributo2=" + atributo2 + "]";
	}

	public int metodo1() {
		int resultado;
		resultado=getAtributo1()+atributo2;
		return resultado;
	}
	
	

}
