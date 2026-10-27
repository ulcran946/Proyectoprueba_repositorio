package Tema3;

public class pag139_1 {
	public static int calc(int numero) {
		if (numero>=10) {
			return 1+calc(numero/10);
		}else {
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println(calc(10));
		System.out.println(calc(0));
		System.out.println(calc(9));
		System.out.println(calc(12345));
	}

}
