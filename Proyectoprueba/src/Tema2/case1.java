package Tema2;

import java.util.Scanner;

public class case1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número entero: ");
		int x;
		x=entrada.nextInt();
		
	switch (x) {   
	case 0:
	case 1:    
	case 2:    
	case 3:        
	case 4:  
		System.out.println("suspenso");break;   
	case 5:          
		System.out.println("suficiente");break;      
	case 6:       
		System.out.println("bien");break;      
		
	case 7:    
	case 8:  
		System.out.println("notable"); break; 
	case 9:  
	case 10:   
		System.out.println("sobresaliente"); break;    
	default:        
		System.out.println("El valor de x no estaba entre 0 y 10"); }
	}
}
