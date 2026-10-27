package Tema4;

public class pag18_2 {
	public static void main(String[] args) {
		int[][] matriz = {{1,2,9},{4,7,5},{7,3,6}}; 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}
