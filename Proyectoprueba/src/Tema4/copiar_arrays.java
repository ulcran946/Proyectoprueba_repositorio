package Tema4;

import java.util.Arrays;

public class copiar_arrays {

	public static void main(String[] args) {
		//declaracion e inicializacion
		int[] primos = {1, 2, 3, 5, 7, 11, 13};
		int[] copia = new int[primos.length];
		//copia
		System.arraycopy(primos, 1, copia, 3, 3);
		//salida
		System.out.println(Arrays.toString(primos));//[1,2,3,5,7,11,13]
		System.out.println(Arrays.toString(copia));//[0,0,0,2,3,5,0]
		
	}
}
