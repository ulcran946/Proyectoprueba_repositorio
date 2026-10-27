package Tema2;
import java.util.Scanner;
public class ejerP4 {
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int altura,relleno;
		System.out.print("Introduce la altura: ");
		altura=escaner.nextInt();
		
		System.out.print("Introduce relleno 1 o sin relleno 0: ");
		relleno = escaner.nextInt();
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= i; j++ ) {
				if ((j==1 || i==altura || i==j || relleno==1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		escaner.close();
	}
}
