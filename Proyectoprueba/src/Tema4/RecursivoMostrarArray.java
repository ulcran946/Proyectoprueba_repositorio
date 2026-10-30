package Tema4;

public class RecursivoMostrarArray {


		public static void imprimirArray(Object obj) {
	        if (obj == null) {
	            System.out.print("null");
	            return;
	        }else if (obj.getClass().isArray()) {
	        	Object[] pepe=((Object[]) obj);
	            int longitud =  pepe.length;
	            System.out.print("[");            
	            for (int i = 0; i < longitud; i++) {              
	                imprimirArray(((Object[]) obj)[i]);                
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
	    	String p=null;
	    	imprimirArray(p);
	    	
	    	String[] array= {"alvaro2","Juan"};
	    	String[][][] array1={{{"alvaro2","Juan"},{"alvaro2","Juan"}},{{"alvaro2","Juan"},{"alvaro2","Juan"}}};
	    	String[][][][] array2= {{{{"alvaro2","Juan"},{"alvaro2","Juan"}},{{"alvaro2","Juan"},{"alvaro2","Juan"}}},{{{"alvaro2","Juan"},{"alvaro2","Juan"}},{{"alvaro2","Juan"},{"alvaro2","Juan"}}}};
	    	int dato=4;
	    	Integer[] dato1= {1,2};
	    	Integer[][] dato2= {{1,2},{1,2}};
	    	int [][][] arrayEnteros = {
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
	                
	            
	    	
	        imprimirArray(array);
	        System.out.println("");
	        imprimirArray(array1);
	        System.out.println("");
	        imprimirArray(array2);
	        System.out.println("");
	        
	        imprimirArray(dato);
	        System.out.println("");
	        imprimirArray(dato1);
	        System.out.println("");
	        imprimirArray(dato2);
	        System.out.println("");
	        
	        
	        imprimirArray(arrayEnteros);
	        System.out.println("");
	        imprimirArray(arrayEnteros1);
	        
	    }
	}