package ejercicio06;

import ejercicio05.Oficina;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implementar un programa para un banco, donde se gestione la parte de cuentas de los usuarios. Este
			banco solo y exclusivamente tiene 3 tipos de cuentas, cuenta corriente, cuenta joven y cuenta empresa.
			Cada una de ellas se caracteriza por:
			• La cuenta corriente paga mantenimiento fijo y acumula puntos cuando se usa en el cajero.
			• La cuenta joven no tiene mantenimiento y además, se le regala 1€ cada vez que hace un ingreso.
			• La cuenta de empresa, no tiene cuota de mantenimiento, pero el banco cobra un euro a la
			empresa cuando saca dinero ya que está pensada para hacer transferencias y no usar dinero en
			efectivo.
			El cliente tendrá un saldo, podrá sacar o meter dinero (reintegro e ingreso) por el cajero y dependiendo
			del tipo de cuenta se le hará un determinado cálculo y se le actualizará el saldo.
			Hacer una clase oficina con un array de cuentas y probar los métodos anteriores, calcular el total de
			dinero que tiene la oficina entre todas las cuentas, cuánto se ha ganado la oficina por las veces que las
			cuentas de empresa han sacado dinero, cuánto ha gastado la oficina del banco en regalar el euro cuando
			se ingresa dinero en una cuenta joven, etc.
			Ampliación: Quien lo desee, puede plantearse alguna clase más, como la clase cliente que puede tener
			varias cuentas o que en la clase Oficina también haya un atributo que sea la lista de Clientes.
		 */
		
		int tam=3;
		
		Cuentas c1=new CuentaCorriente(9000, 1, 1111, 10);
		Cuentas c2=new CuentaJoven(2000, 2, 1112);
		Cuentas c3=new CuentaEmpresa(20000, 3, 1113);

		
		Cuentas[] listaDeCuentas = new Cuentas[tam];
		
		listaDeCuentas[0]=c1;
		listaDeCuentas[1]=c2;
		listaDeCuentas[2]=c3;
		
		Ofinina o=new Ofinina(listaDeCuentas);
		
		//o.generarListaCuentas();
		
		o.generarListaCuentas(listaDeCuentas);
		System.out.println("--------------------------------");
		System.out.println(c1.elegirDineroOperacion());
		System.out.println(c1.elegirMantenimiento());
		System.out.println(c1.calcularSaldoMantenimiento());
		System.out.println(c1.ingresarDinero());
		c1.ingresarDinero();
		c1.sacarDinero();
		System.out.println(c1);
		System.out.println("----------------------------------");
		System.out.println(c2.elegirDineroOperacion());
		System.out.println(c2.ingresarDinero());
		System.out.println(c2.sacarDinero());
		System.out.println(c2);
		System.out.println("----------------------------------");
		System.out.println(c3.elegirDineroOperacion());
		System.out.println(c3.sacarDinero());
		System.out.println(c3);
		System.out.println("----------------------------------");
		o.calcularDineroBnaco(listaDeCuentas);

	}

}
