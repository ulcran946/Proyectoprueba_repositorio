package Tema3;

public class pag139_4 {

public static void main(String[] args) {
		System.out.println("el numero 1000010001 es binario "+Binario(100010001));
		System.out.println("el numero 1000020001 es binario "+Binario(100020001));
		System.out.println("el numero 2000010001 es binario "+Binario(200010001));
		System.out.println("el numero 1000010009 es binario "+Binario(100010009));
	}
	public static boolean Binario (int numero) {
		if (numero==1 || numero==0) {
			return true;
			}else if (numero%10==0 || numero%10==1) {
				return Binario(numero/10);
				}else {
					return false;
		}
	}
}
