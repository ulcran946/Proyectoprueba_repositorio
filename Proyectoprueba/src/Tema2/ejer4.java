package Tema2;

import java.util.Scanner;

public class ejer4 {
	
	public static void main(String[] args) {
		System.out.println("Pon un numero mayor que 0");
		Scanner entrada = new Scanner(System.in);
		int origen=0;
		String cadena="";
		int total=0;
		while ((origen=entrada.nextInt())!=0) {
			if (comprobarNumero(origen)) {
				total+=origen;
				if (cadena.length()>0) {
					cadena=cadena.concat(" + ");
				}
				cadena=cadena+origen;
			}
		}
		System.out.println(cadena+"="+total);
		entrada.close();
	}
	
	/**
	 * Metodo que me dice si la suma de las cifras de eese numero corresponde con el numero de digitos
	 * @param origen numero origen
	 * @return boolean true si es correcto y false si no
	 */
	static boolean comprobarNumero(int origen) {
		int numero=0;
		int suma=0;
		while (origen!=0) {
			suma+=(origen%10);
			origen=origen/10;
			numero++;
		}
		if (suma==numero) {
			return true;
		}else {
			return false;
		}
	}
	
}
