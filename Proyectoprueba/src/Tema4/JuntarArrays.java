package Tema4;

public class JuntarArrays {

	public static int[][] procesarArray(int[][] a, int[][] b) {
		int resultado[][]= new int [a.length][a[0].length];
		for (int fila=0;fila<a.length;fila++) {
			for (int columna=0;columna<a[fila].length;columna++) {
				if (a[fila][columna]>b[fila][columna]) {
					resultado[fila][columna]=a[fila][columna];
				}else {
					resultado[fila][columna]=b[fila][columna];
				}
			}
		}		
		return resultado;
	}
	
	
	public static void main(String[] args) {
    int[][] a= {{1,2,3},{6,7,8},{10,8,15}};
    int[][] b= {{5,1,4},{7,3,11},{11,12,13}};
    int[][] c= procesarArray(a, b);
    RecursivoMostrarArray2.imprimirArray(c);

	}

}
