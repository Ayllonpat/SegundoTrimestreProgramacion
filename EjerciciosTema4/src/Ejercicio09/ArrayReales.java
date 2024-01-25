package Ejercicio09;

import java.util.Arrays;

public class ArrayReales implements IEstadisticas{
			
	private double num;

	public ArrayReales(double num) {
		super();
		this.num = num;
	}

	public ArrayReales() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayReales(ArrayReales[] num) {
		// TODO Auto-generated constructor stub
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ArrayReales [num=" + (num) + "]";
	}
	
	public void mostrarLista(ArrayReales[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

	@Override
	public double calcularMinimo(ArrayReales[] num) {
		double min = 0;
		// TODO Auto-generated method stub
		for(int i=0;i<num.length;i++) {
			if(i==0) {
				min=i;
			}else if(i<=min) {
				min=i;
			}
		}
		return min;
	}

	@Override
	public double calcularMaximo(ArrayReales[] num) {
		// TODO Auto-generated method stub
		double max = 0;
		// TODO Auto-generated method stub
		for(int i=0;i<num.length;i++) {
			if(i==0) {
				max=i;
			}else if(i>=max) {
				max=i;
			}
		}
		return max;
	}

	@Override
	public double calcularSumatorio(ArrayReales[] num) {
		// TODO Auto-generated method stub
		double total=0;
		for(int i=0;i<num.length;i++) {
			total=total+num[i].getNum();
		}
		return total;
	}

}
