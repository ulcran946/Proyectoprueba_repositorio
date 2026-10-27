package Tema2;
import java.util.Scanner;
public class cuadradoTriangulos {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Altura: ");
	int altura = entrada.nextInt();

	for (int i = 1; i <= altura; i++) {
		for (int j = 1; j <= altura; j++) {
			if (i == 1 || i == altura || j == 1 || j == altura || (i == 2 && (j == 2 || j == altura - 1)) || (i == altura - 1 && (j == 2 || j == altura - 1))) {
				System.out.print("*");
				} else { System.out.print(" "); } }
		System.out.println(); 
	}
	entrada.close(); 
	} 
}

