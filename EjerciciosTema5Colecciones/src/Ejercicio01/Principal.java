package Ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		List <Nota> lista= new ArrayList <Nota> ();
		
		CrudNota cn=new CrudNota(lista);
		
		int opcion=0;
		
		lista.add(new Nota("Holi", 0, "Saludos"));
		lista.add(new Nota("Adios",1, "Despedidas"));
		
		do{
		
		System.out.println("Notas");
		System.out.println("---------------------------------------------");
		cn.mostrar();
		}while(opcion!=0);
	}

}
