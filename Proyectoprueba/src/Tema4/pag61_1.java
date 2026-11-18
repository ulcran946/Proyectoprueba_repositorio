package Tema4;

import java.util.Scanner;

public class pag61_1 {
	static int[][] generarMatrizRandom(int tamaño, int max) {
		int[][] array = new int[tamaño][tamaño];
		for (int fila=0; fila < array.length;fila++) {
			for (int columna=0; columna < array.length;columna++) {
				array[fila][columna] = (int) (Math.random()*(max+1));
			}
			
		}return array;
	}
	public static void main(String[] args) {
		int max=10;
		Scanner escaner = new Scanner(System.in);
		System.out.print("introduce tamaño de la matriz ");
		int tamaño = escaner.nextInt();
		System.out.println(tamaño);
		MostrarArray(generarMatrizRandom(tamaño, max));
	}
	static void MostrarArray(int[][] array) {
		for (int[] sublista: array) {
			for (int valor:sublista) {
				System.out.print(valor+" ");
			}System.out.println();
		}
	}
}
