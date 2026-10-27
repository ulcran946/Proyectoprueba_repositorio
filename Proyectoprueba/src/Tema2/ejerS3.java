package Tema2;

import java.util.Scanner;

public class ejerS3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce cadena: ");
		String cadena = entrada.nextLine();
		int palabras = 0;
		if (cadena!= "") {
			palabras++;
		}
		for (int i=0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ' && cadena.charAt(i+1) != ' ') {
				palabras++;
			}
		}
		entrada.close();
		System.out.println("La cadena contiene "+palabras+" palabras");
		
	}
}
