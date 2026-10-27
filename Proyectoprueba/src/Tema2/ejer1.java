package Tema2;

import java.math.BigDecimal;
import java.util.Scanner;

public class ejer1 {
	
	public static void main(String[] args) {
	System.out.println("Dime un numero de repeticiones");
	Scanner entrada = new Scanner(System.in);
	int n = entrada.nextInt();
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	int nmin = 0;
	int nmax = 0;
	

		for (int j = 0 ; j < n ; j++ ) {
			System.out.print("Introduce valor");
			Scanner entra = new Scanner(System.in);
			int a=entra.nextInt();
			if (a == max) {
				nmax++;
			}
			if (a == min) {
				nmin++;
			}
			if (a == min) {
				min = a;
				nmin = 1;
			}
			if (a > max) {
				min = max;
				nmax = 1;
				
			}
		}
		System.out.print("el numero menor es " + min + " y a aparecido " + nmin);
		System.out.print("el numero maximo es " + max + " y a aparecido " + nmax);
	}
}
