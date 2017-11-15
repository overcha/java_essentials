package src1.tareas;

import libs.Input;

public class MarioFacil {

	public static void main(String[] args) {
		System.out.print("Altura: ");
		int altura = Input.get_int();
		int base = altura + 1;
		int espacios = base - 2;
		
		do {
			for(int i = espacios; i > 0; i--) {
				System.out.print(" ");
			}
			for(int i = base - espacios; i > 0; i-- ) {
				System.out.print("#");
			}
			System.out.print("\n");
			espacios = espacios - 1;
		
		} while (espacios >= 0);		
	}
}


