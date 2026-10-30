package Tema4;

public class pag28 {

	public static int[ ][ ] crearMatriz(int n ) {
		int[][]matriz = new int [n][n];
		for (int i = 0; i<matriz.length; i++) {
			for (int j=0;j<matriz.length;j++) {
				if (i==j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}
		}
		return matriz;
		
	}


	public static void imprimirMatriz(int[ ][ ] m) {
		for (int[] fila : m) {
			for (int columna : fila) {
				if(columna==1) System.out.print("X ");
				else System.out.print("- ");
			}
		}
	}
		public static void imprimirMatrizInversa(int[ ][ ] m) {
			for (int i= 0; i<m.length; i++) {
				for (int j=m[i].length-1; j>=0;j--) {
					if (m[i][j]==1) {
						System.out.print("X ");
					}else {
						System.out.print("- ");
					}
				}System.out.println();
			}
		}
}
		

