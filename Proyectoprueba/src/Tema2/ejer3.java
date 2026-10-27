package Tema2;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		int valor=1;
		int resultado=0;
		String cadena="";
		while (valor > 0) {
			
			System.out.println("introduce numero");
			Scanner entrada = new Scanner(System.in);
			valor=entrada.nextInt();
			resultado=valor+resultado;
			cadena=cadena.concat(valor+"+");
			
			
		}
		if (cadena.length()>0) {
			cadena=cadena.substring(0,cadena.length()-1);
		}
		System.out.println(cadena+"="+resultado);

		
		
	}
}
