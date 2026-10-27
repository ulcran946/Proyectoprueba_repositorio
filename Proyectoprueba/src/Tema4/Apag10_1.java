package Tema4;
import java.util.Scanner;
//Crea un método que dado un Array de enteros y un valor entero, muestre la cantidad de veces que aparece el entero en el Array.

public class Apag10_1 {
	
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.print("introduce un numero ");
		int numero = escaner.nextInt();
		int [] enteros = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,5,6,7,7,7,8,9};
		System.out.println("El numero "+numero+" aparece "+enteros(enteros,numero)+" veces ");
	}
	
	public static int enteros(int[] enteros,int n){
		int i;
		int contador=0;
		for (i=0; i<enteros.length; i++){
			if (enteros[i]==n) {
				contador++;
			}
		}
		return contador;
	}	
}
