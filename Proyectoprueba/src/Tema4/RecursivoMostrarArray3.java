package Tema4;
import java.lang.reflect.Array;
public class RecursivoMostrarArray3 {
	
		public static void imprimirArray(Object obj) {
	        if (obj == null) {
	            System.out.print("null");
	            return;
	        }else if (obj.getClass().isArray()) {
	            int longitud = Array.getLength(obj);
	            System.out.print("[");            
	            for (int i = 0; i < longitud; i++) {              
	                imprimirArray(Array.get(obj, i));                
	                if (i < longitud - 1) {
	                    System.out.print(", ");
	                }
	            }            
	            System.out.print("]");
	        } else {
	            System.out.print(obj);
	        }
	    }

	    public static void main(String[] args) {
	    
	        String[] array= {"alvaro","Juan"};
	        int[] enemigo= {1,2};
	    	int[][][] arrayEnteros = {
	            {
	                {1, 2}, 
	                {3, 4}
	            },
	            {
	                {5, 6}, 
	                {7, 8}
	            }
	        };
	        
	    	int[][][] arrayEnteros1 = {
	                {
	                    {1, 2}, 
	                    {3, 4}
	                }};
	                
	            
	    	 imprimirArray(enemigo);
		        System.out.println("");
	        imprimirArray(array);
	        System.out.println("");
	        imprimirArray(arrayEnteros);
	        System.out.println("");
	        imprimirArray(arrayEnteros1);
	        
	    }
	}