package src1.tareas;

import java.text.DecimalFormat;

import libs.Input;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("Número ");
		float n = Input.get_float();
		//String s = new String(); 
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("0.5: "+(n - (float)0.5));
		//System.out.println("0.25: "+(n - (float)0.25));
		//System.out.println("0.1: "+(n - (float)0.1));
		//System.out.println("0.05: "+(n - (float)0.05));
		System.out.println("DF: "+(df.format(n - (float)0.5)));
		//System.out.println("0.01: "+(n - (float)0.01));
		n = Float.parseFloat((df.format(n - (float)0.5)));
		System.out.println("PF: "+n);

	}

}
