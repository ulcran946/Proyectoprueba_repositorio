package Tema4;

public class Varags {

	static void mostrarEnteros(int... nums) {
		System.out.print("Hay "+nums.length+" enteros: ");
		for (int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
	static void main (int a=2,int b=3) {
		mostrarEnteros();
	mostrarEnteros(1,2,3);
	mostrarEnteros(b,a++,a*b,++b);
	}
}
