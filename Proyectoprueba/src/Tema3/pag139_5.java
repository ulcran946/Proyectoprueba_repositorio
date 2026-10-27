package Tema3;

public class pag139_5 {

	public static void main(String[] args) {
		PasarBinario(5);
		System.out.println();
		PasarBinario(10);
		System.out.println();
		PasarBinario(8);
		System.out.println();
		PasarBinario(1);
		System.out.println();
	}

	public static int PasarBinario (int numero) {
		if (numero>=1) {
			int a=PasarBinario(numero/2);
			System.out.print(numero%2);
			return a;
		}else if (numero==1) {
			System.out.print(numero);
			return numero;
			}else {
			return numero;
			}
	}
}
