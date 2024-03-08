package lambda1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String mensaje= "Buenos dias";
		
		//z -> z+dos;

		IBienvenida bienvenida = (x) -> System.out.println(x);
		
		bienvenida.mostrarBienvenida(mensaje);
		
		int e=3;
		
		ISuma suma1= z-> z+2;
		
		System.out.println(suma1.sumar(e));
		
		double kmRecorridos=0;
		
		List<Vehiculo> lista=new ArrayList<Vehiculo>();
		
		Supplier<Double>kmR = ()-> Math.random();
		
		
			kmRecorridos =kmR.get();
			
			System.out.println(kmRecorridos);
		
		
		//Consumer<String> mostrarMatricula =(m) -> System.out.println(m);
		
	}

}
