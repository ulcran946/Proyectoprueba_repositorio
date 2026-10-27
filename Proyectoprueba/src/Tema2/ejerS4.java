package Tema2;

import java.util.Scanner;

public class ejerS4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce cadena: ");
		String cadena = entrada.nextLine();
		cadena = cadena.trim();
		String anedac = "";
		for (int i=cadena.length()-1; i > -1; i--) {
			anedac = anedac.concat(String.valueOf(cadena.charAt(i)));
		}
		entrada.close();
		System.out.println(anedac);
		if (cadena.equalsIgnoreCase(anedac)) {
			System.out.println("La palabra es un palindromo");
		}else {
			System.out.println("La palabra no es un palindromo");
		}
	}
}
