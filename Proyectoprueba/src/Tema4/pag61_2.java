package Tema4;

import java.util.Arrays;

public class pag61_2 {
	public static int numeroAzar(int max) {
		return (int) numeroAzar(0,max);
	}
	public static int numeroAzar(int min, int max) {
		return (int) (Math.random()*(max-min+1)+min);
	}
	public static int [][] crearMatriz1 (int filasMax,int filasMin,int columnMax,int columnMin,int numeroMaximo){
		int[][] matriz=new int[numeroAzar(filasMin,filasMax)][];
		for (int i=0;i<matriz.length;i++) {
			matriz[i]=new int[numeroAzar(columnMin,columnMax)];
			for (int j=0;j<matriz[i].length;i++) {
				matriz[i][j]= numeroAzar(numeroMaximo);
			}
		}return matriz;
	}
	
	public static void main(String[] args) {
		int[][] matriz=crearMatriz(10,6,8,3,50);
		System.out.println(Arrays.deepToString(matriz));
	}
	
	public static int[][] crearMatriz (int filasMax,int filasMin,int columnMax,int columnMin,int numeroMaximo){
		int[][] matriz=new int[numeroAzar(filasMin,filasMax)][];
		for (int i=0;i<matriz.length;i++) {
			int[] completarFilas=new int[]
		}
	}
	/*
	static int[][] generarMatrizRandom(int min, int max) {
		int fila=(int) ((Math.random()*(max))+min);
		int columna=(int) ((Math.random()*(max))+min);
		System.out.println("Filas: "+fila);
		System.out.println("Columnas: "+columna);
		int[][] array = new int[fila][columna];
		for (int f=0; f < fila;f++) {
			for (int c=0; c < columna;c++) {
				//Para que los numeros del array no sean 0
				//int numero=(int) ((Math.random()*(max))+min);
				array[f][c] = (int) (Math.random()*(max+1));
			}
			
		}return array;
	}
	public static void main(String[] args) {
		int max=10;
		int min=1;
		MostrarArray(generarMatrizRandom(min, max));
	}
	static void MostrarArray(int[][] array) {
		for (int[] sublista: array) {
			for (int valor:sublista) {
				System.out.print(valor+" ");
			}System.out.println();
		}
	}
	*/

}
