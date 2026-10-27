package Tema2;

import java.util.Scanner;

public class ternanira {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;
		System.out.print("Introduzca un número entero: ");
		a=entrada.nextInt();
		System.out.println("La nota es: " + (a) );
		String mensaje = (a>10 || a<0) ? "error" :
			a>= 9 ? "sobresaliente" :
			a>= 7 ? "notable" :
			a== 6 ? "bien" :
			a== 5 ? "suficiente" : "suspenso" ;
			System.out.println(mensaje);
		
	}
}	
	