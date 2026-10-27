package Tema2;
import java.util.Scanner;
public class ejerP3 {
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int altura,relleno;
		System.out.print("Introduce la altura: ");
		altura=escaner.nextInt();
		System.out.print("Introduce relleno 1 o sin relleno 0: ");
		relleno = escaner.nextInt();
		for (int dAltura = 1; dAltura <= altura; dAltura++) {
			for (int l=1;l<=(altura-dAltura);l++){
				System.out.print("  ");
			}
			for (int dBase = 1; dBase <= dAltura; dBase++) {
				if ((dBase==1 || dAltura==altura || dAltura==dBase || relleno==1)) {
					System.out.print("* "+"  ");
				}else {
					System.out.print("  "+"  ");
				}
			}
			System.out.println();
		}
		escaner.close();
	}
}
