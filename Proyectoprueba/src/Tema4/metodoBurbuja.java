package Tema4;

import java.util.Arrays;

public class metodoBurbuja {
	
	public static void main(String[] args) {
		int [] vector = {7,1,3,15,2};
		int [] nuevo  ;
		System.out.println(burbuja(vector));
	}

	public static int[] burbuja(int[] vector) {
		int aux;
		for (int i = 0; i < vector.length; i++) {
			boolean control = true;
			for (int j = 0; j < vector.length - i - 1;j++) {
				//El valor maximo lo mas a la derecha posible
				if (vector[j] > vector[j + 1]) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
					control = false;
				}
			}
			if (control) {
				break;
			}
		}
		return vector;
	}
}
