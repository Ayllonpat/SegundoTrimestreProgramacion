package ejemploMadre;

public class Madre {
	
	private int atributo1 = 1;

	public Madre(int atributo1) {
		super();
		this.atributo1 = atributo1;
	}

	public int getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}

	@Override
	public String toString() {
		return "Madre [atributo1=" + atributo1 + "]";
	}
	
	public int metodo1() {
		int resultado;
		
		resultado=atributo1+10;
		
		return resultado;
	}

}
