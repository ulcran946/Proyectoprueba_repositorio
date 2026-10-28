package Tema4;

public class arraybidiirregu {
	public static void main(String[] args) {
		int[][][] p = {{ {1, 2, 5}, {1, 2,} }, {{1, 2, 5}, {1, 2,} }, {{1, 2, 5}, {1, 2,} }};
		for (int[][] sub : p) {
			for (int[] dato : sub) {
				System.out.print(dato + ",");
			}
			System.out.println("");
		}
	}
}
