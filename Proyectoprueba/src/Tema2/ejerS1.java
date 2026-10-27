package Tema2;

import java.util.Scanner;

public class ejerS1 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.print("Introduce una palabra: ");
		String palabra = escaner.next();
		System.out.print("Resultado: ");
		for (int i = 0; i < palabra.length(); i++) {
			System.out.print(palabra.charAt(i) + " ");
		}
		escaner.close();
	}
}
