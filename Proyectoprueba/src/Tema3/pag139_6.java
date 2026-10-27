package Tema3;

public class pag139_6 {

	public static void main(String[] args) {
		System.out.println(COA("Hosoa"));
		System.out.println (COA("HOSTU"));
		System.out.println (COA("AB"));
	}
	public static boolean COA(String cadena) {
		char letra= (char) 0;
		return COA(cadena.toUpperCase(),letra);
	}
	public static boolean COA(String cadena,char letra) {
		if (cadena.length()==0) {
			return true;
		}else if (cadena.charAt(0)<letra) {
			return false;
		}else {
			if (letra<cadena.charAt(0)) {
				letra=cadena.charAt(0);
			}
			return COA(cadena.substring(1), letra);
		}
	}
}
