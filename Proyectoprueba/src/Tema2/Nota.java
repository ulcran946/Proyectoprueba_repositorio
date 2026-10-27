package Tema2;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.print("Introduzca un número entero: ");
		n=entrada.nextInt();	
		System.out.println("La nota es: " + (n) );
		if (n>=9 && n<=10) {
			System.out.println( "Sobresaliente" );}
 			else {
			if (n<9 && n>=7) {
				System.out.println( "notable" );}
	 			else {
	 				if (n==6) {
	 					System.out.println( "bien" );}
	 					else {
	 						if (n==5) {
	 							System.out.println( "suficiente" );}
	 							else if (n<5 && n>=0) {
	 								System.out.println( "suspenso" );}
	 								else {
	 									System.out.println( "escribe un numero valido" );
	 								}
	 							}
	 					}		
	 			}
		}
}
