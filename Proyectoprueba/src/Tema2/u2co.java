package Tema2;

	import java.util.Scanner;

	public class u2co {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			String nombre;
			int n;
			System.out.print("Introduzca un número entero: ");
			n=Integer.parseInt(entrada.nextLine());		
			entrada.nextLine();
			System.out.println("El cuadrado es: " + Math.pow(n,2));
			System.out.print("Introduzca su nombre: ");
			nombre = entrada.nextLine(); //leemos correctamente la String
			System.out.println("Hola " + nombre + "!!");
			}
		
		
	}