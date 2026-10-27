package Tema3;
import java.util.Scanner;
public class pag139_7 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.print("introduce un numero ");
		int numero = escaner.nextInt();
		System.out.println("Para el numero "+numero);
		System.out.print("Esta es su suma: ");
		int resultado = suma(numero);
		System.out.println(" = "+resultado);
		int numero2 = 0b00001001;
		System.out.println(numero2);
	}
	public static int suma(int num) {
		if (num == 1) {
			System.out.print("1");
			return 1;
		}
		int acumulado = suma(num - 1);
		System.out.print(" + "+num);
		return num + acumulado;
	}
		
}
