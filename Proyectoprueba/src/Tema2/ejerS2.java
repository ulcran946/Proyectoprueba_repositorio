package Tema2;

import java.util.Scanner;

public class ejerS2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String cadenaDePalabras ="";
		int mayor=0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("introduce palabra: ");
			String palabra= entrada.next();
			if (palabra.length() > mayor) {
				mayor=palabra.length();
				cadenaDePalabras=palabra;
			}else if (palabra.length() == mayor) {
				if(!cadenaDePalabras.contains(palabra))
					cadenaDePalabras=cadenaDePalabras+" "+palabra;
				
			}
			
		}
		System.out.print("La palabra mas larga es: "+mayor+ " "+cadenaDePalabras);
		entrada.close();
	}
}
