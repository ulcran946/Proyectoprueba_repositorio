package Tema3;

import java.util.Scanner;

public class pag86_1 {

	//dibujar cuadrado(int base); --> relleno

	public static void cuadrado(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int base;
		int relleno;
		int i;
		int j;	
		System.out.print("Introduce la base: ");
		base = escaner.nextInt();
		System.out.print("Introduce relleno 1 o sin relleno 0: ");
		relleno = escaner.nextInt();
		for (i = 1; i<= base; i++) {
			for (j = 1; j <= base; j++) {
				
				
			}
			System.out.println();
		}
		
		escaner.close();
	}
}

