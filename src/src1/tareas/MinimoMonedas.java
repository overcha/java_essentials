package src1.tareas;
import java.text.DecimalFormat;
import libs.Input;

public class MinimoMonedas {

	public static void main(String[] args) {
		// Considerando monedas de 1c, 5c, 10c, 25c y 50c
		System.out.println("Hola! Cuánto cambio te debo? O hai!");
		float cambio = Input.get_float();
		DecimalFormat decForm = new DecimalFormat("###.##");
		//BigDecimal cambioBdec = new BigDecimal(cambio);
		int moneda = 0;
		int num = 0;
		
		do {
			if(cambio>=0.5f)
				moneda = 50;
			else if(cambio>=0.25f)
				moneda = 25;
			else if(cambio>=0.1f)
				moneda = 10;
			else if(cambio>=0.05f)
				moneda = 5;
			else if(cambio>=0.01f)
				moneda = 1;
			
			switch (moneda) {
			case 50:
				cambio = Float.parseFloat(decForm.format(cambio - (float)0.5));
				num++;
				moneda = 0;
				break;
			case 25:
				cambio = Float.parseFloat(decForm.format(cambio - (float)0.25));
				num++;
				moneda = 0;
				break;
			case 10:
				cambio = Float.parseFloat(decForm.format(cambio - (float)0.1));
				num++;
				moneda = 0;
				break;
				/*boolean bandera = false;
				if(cambio==0.100000024f) {
					bandera = true;
					cambio = 10;
				}
				if(bandera==false) {
					cambio = cambio * 100;
					cambio = cambio - 10;
				}
				else
					cambio = cambio - 10;
				num++;
				break;*/
			case 5:
				cambio = Float.parseFloat(decForm.format(cambio - (float)0.05));
				num++;
				moneda = 0;
				break;
			case 1:
				cambio = Float.parseFloat(decForm.format(cambio - (float)0.01));
				num++;
				moneda = 0;
				break;
			case 0:
				if((cambio-0.01f)<0) {
					cambio = 0;
					System.out.println("Moneda no existente");
				}
				break;
			}
		
		} while(cambio>0);
		System.out.print(num);
	}
}
