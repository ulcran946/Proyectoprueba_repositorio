package Tema4;

import java.util.Scanner;

public class pag61_4 {
	static int[][] generarMatrizRandom(int min, int max) {
		Scanner escanerf = new Scanner(System.in);
		System.out.print("introduce fila de la matriz ");
		int fila=escanerf.nextInt();
		Scanner escanerc = new Scanner(System.in);
		System.out.print("introduce columna de la matriz ");
		int columna=escanerc.nextInt();
		System.out.println("Filas: "+fila);
		System.out.println("Columnas: "+columna);
		int[][] array = new int[fila][columna];
		//Array dado la vuelta
		int[][] arrayC = new int[columna][fila];
		for (int f=0; f < fila;f++) {
			for (int c=0; c < columna;c++) {
				//Para que los numeros del array no sean 0
				int num=(int) ((Math.random()*(max))+min);
				array[f][c] = num;
				arrayC[c][f] = num;
			}			
		}
		System.out.println("Array Creado");
		MostrarArray(array);
		System.out.println("Array Cambiado");
		MostrarArray(arrayC);
		return array;
	}

	
	
	public static void main(String[] args) {
		int max=10;
		int min=1;
		generarMatrizRandom(min, max);
	}
	static void MostrarArray(int[][] array) {
		for (int[] sublista: array) {
			for (int valor:sublista) {
				System.out.print(valor+" ");
			}System.out.println();
		}
	}
}
