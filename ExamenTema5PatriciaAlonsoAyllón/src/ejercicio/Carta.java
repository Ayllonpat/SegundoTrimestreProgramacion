package ejercicio;

public class Carta implements Comparable<Carta>{
	
	private String nombre;
	private String palo;
	private int num;
	
	public Carta(String nombre, String palo, int num) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.num = num;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", palo=" + palo + ", num=" + num + "]";
	}
	
	public int devolverValorCarta(Carta c) {
		
		if(c.getNum()==1) {
			return 11;
		}else if(c.getNum()==2) {
			return 0;
		}else if(c.getNum()==3) {
			return 10;
		}else if(c.getNum()==4) {
			return 0;
		}else if(c.getNum()==5) {
			return 0;
		}else if(c.getNum()==6) {
			return 0;
		}else if(c.getNum()==7) {
			return 0;
		}else if(c.getNum()==8) {
			return 0;
		}else if(c.getNum()==9) {
			return 0;
		}else if(c.getNum()==10) {
			return 2;
		}else if(c.getNum()==11) {
			return 3;
		}else if(c.getNum()==12) {
			return 4;
		}else {
			return 0;
		}
		
	}
	public int compareTo(Carta c) {
		// TODO Auto-generated method stub
		
		
		return (c.palo).toLowerCase().compareTo((c.palo).toLowerCase());
	}
	
	
}
