package Tema2;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		System.out.println("introduce numero");
		Scanner entrada = new Scanner(System.in);
		int valor=entrada.nextInt();
		int nApariciones=1;
		int nuemroAux=valor;
		while (valor>10) {
			nApariciones++;
			valor=valor/10;
		}
		System.out.println("el numero de digitos de: "+nuemroAux+" es "+nApariciones);
		entrada.close();
	}
}
