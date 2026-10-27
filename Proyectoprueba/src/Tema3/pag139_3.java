package Tema3;

public class pag139_3 {
	public static int resultado=0;

	public static void main(String[] args) {
		cambio(1234);
		System.out.println(1234);
		System.out.println(resultado);
	}
	
	public static int cambio (int numero) {
		if (numero>=10) {
			resultado=(numero%10)+(resultado*10);
			return cambio(numero/10);
		}else {
			resultado=(numero%10)+(resultado*10);
			return numero;
		}
	}
	
	
}
