package Tema2;

import java.util.Scanner;

public class ejerP1 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int base;
		int altura;
		int i;
		int j;
		
		System.out.print("Introduce la base: ");
		base = escaner.nextInt();
		
		System.out.print("Introduce la altura: ");
		altura = escaner.nextInt();
		
		for (i = 1; i<= altura; i++) {
			for (j = 1; j <= base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		escaner.close();
	}
}
