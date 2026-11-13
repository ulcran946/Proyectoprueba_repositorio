package Tema4;

import java.util.Arrays;

public class ordenarNumArray {
	public static int[] siguiente(int fila, int columna, int[][]a) {
		int subfila=0;
		int subcolumna=0;
		System.out.println(a[fila].length);
		if (a[fila].length>(columna+1)) {
			subfila=fila;
			subcolumna=columna+1;
		}else if (a.length>(fila+1)) {
			subfila=fila+1;
			subcolumna=0;
		}else {
			subfila=-1;
			subcolumna=-1;
		}
		int[] devolucion = {subfila,subcolumna};
		return devolucion;
	}
	
	
	public static void subOrden(int fila, int columna, int[][]a) {
		int[] siguiente=siguiente(fila,columna,a);
		if ((siguiente[0]>=0)&&(a[fila][columna]>a[siguiente[0]][siguiente[1]])) {
			int aux=a[fila][columna];
			a[fila][columna]=a[siguiente[0]][siguiente[1]];
			a[siguiente[0]][siguiente[1]]=aux;
		}
	}
	
	
	public static void ordenarMatriz(int[][] a) {
		for (int filas=0;filas<a.length;filas++) {
			for (int columnas=0;columnas<a[filas].length;columnas++) {
				subOrden(filas,columnas,a);
				
			}
		}
	}
	
	
	public static void main (String[] args) {
		int [][] matriz= {{1,5,10,25},{30,100,75,30},{15,75,90,45}};
		for (int i=0;i<(matriz.length*matriz[0].length);i++) {
		RecursivoMostrarArray3.imprimirArray(matriz);
		ordenarMatriz(matriz);
		System.out.println("");
		RecursivoMostrarArray3.imprimirArray(matriz);
		}
	}
	
	
	
	
	
	
	
	
	
	
//Fin Clase
}
