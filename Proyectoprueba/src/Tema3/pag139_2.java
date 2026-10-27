package Tema3;

public class pag139_2 {

	public static int elevar(int a, int b) {
			if (b==1) {
				return a;
			}else if (b==0)
				return 1;
			else {
				return a*elevar(a,b-1);
			}
	}

	public static void main(String[] args) {
		System.out.println(elevar(3,4));
		System.out.println(elevar(7,2));
		System.out.println(elevar(2,0));
		System.out.println(elevar(-3,2));
	}
}
