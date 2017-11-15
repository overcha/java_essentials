package src1.tareas;

import libs.Input;

public class BotellasAguas {

	public static void main(String[] args) {
		float min=0;
		do {
			System.out.print("Minutos: ");
			min = Input.get_float();
			if(min>0) {
				float botellas = min * 12;
				System.out.print("Botellas: "+botellas);
			}
		}while (min<1);
	}
}
