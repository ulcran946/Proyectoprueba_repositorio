package Tema4;

public class pag61_2 {
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

}
