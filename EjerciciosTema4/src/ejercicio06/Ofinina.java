package ejercicio06;



public class Ofinina {
	
	private Cuentas[]listaDeCuentas;
	private Cuentas cuentas;

	public Ofinina() {
		super();
	}

	public Ofinina( Cuentas cuentas) {
		super();
		this.cuentas = cuentas;
	}

	public Ofinina(Cuentas[]listaDeCuentas) {
		// TODO Auto-generated constructor stub
	}

	public Cuentas[] getListaDeCuentas() {
		return listaDeCuentas;
	}

	public void setListaDeCuentas(Cuentas[] listaDeCuentas) {
		this.listaDeCuentas = listaDeCuentas;
	}

	public Cuentas getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuentas cuentas) {
		this.cuentas = cuentas;
	}

	public void generarListaCuentas(Cuentas[]listaDeCuentas) {
		
		for(int i = 0;i<listaDeCuentas.length;i++) {
			System.out.println(listaDeCuentas[i]);
		}
	}
		
	
}

 