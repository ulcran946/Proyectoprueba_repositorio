package Tema3;

public class ej6 {

	public static void menu(int a) {
		int i = 1;
		for (; 1 <= a ; i++) {
			System.out.println("Opcion "+i);
		}
		System.out.println("Opcion "+i);
	}
	public static void main(String[] args) {
		menu(4);
	}
}
