package Tema4;

public class pag18_1 {
	public static void main(String[] args) {
		int[][] matriz = {{1,4,5},{6,7,2},{8,3,8}}; 
		for (int i = 0; i < matriz.length; i++) {
			for (int j =0; j< matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}
