package Tema4;

import java.util.Arrays;

public class RecursivoMostrarArray2 {

	public static void imprimirArray(Object obj) {
		if (obj == null) {
			System.out.print("null");
			return;
		} else if (obj.getClass().isArray()) {
			System.out.print("[");

			if (obj instanceof int[]) {
				int[] arr = (int[]) obj;
				for (int i = 0; i < arr.length; i++) {
					imprimirArray(arr[i]);
					if (i < arr.length - 1)
						System.out.print(", ");
				}
			} else if (obj instanceof double[]) {
				double[] arr = (double[]) obj;
				for (int i = 0; i < arr.length; i++) {
					imprimirArray(arr[i]);
					if (i < arr.length - 1)
						System.out.print(", ");
				}
			} else if (obj instanceof boolean[]) {
				boolean[] arr = (boolean[]) obj;
				for (int i = 0; i < arr.length; i++) {
					imprimirArray(arr[i]);
					if (i < arr.length - 1)
						System.out.print(", ");
				}
			} else if (obj instanceof char[]) {
				char[] arr = (char[]) obj;
				for (int i = 0; i < arr.length; i++) {
					imprimirArray(arr[i]);
					if (i < arr.length - 1)
						System.out.print(", ");
				}
			} else if (obj instanceof long[]) {
				long[] arr = (long[]) obj;
				for (int i = 0; i < arr.length; i++) {
					imprimirArray(arr[i]);
					if (i < arr.length - 1)
						System.out.print(", ");
				}
			} else {
				// Para arrays de objetos o multidimensionales (como int[][], String[], etc.)
				Object[] arr = (Object[]) obj;
				for (int i = 0; i < arr.length; i++) {
					imprimirArray(arr[i]);
					if (i < arr.length - 1) {
						System.out.print(", ");
					}
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
        int[][] enemigo2= {{1,2}};
        short[][] arrayEnteros = 
            
            {
                {5, 6}, 
                {7, 8}            
        };
        
    	int[][][] arrayEnteros1 = {
    	        {
                    {1, 2}, 
                    {3, 4}
                },
    	        {
                    {1, 2}, 
                    {3, 4}
                }
                
    	
    	};
                
    /**        
    	
        imprimirArray(array);
        System.out.println("");
        imprimirArray(arrayEnteros);
        System.out.println("");
        imprimirArray(arrayEnteros1);
        System.out.println("");
        System.out.println(Arrays.toString(arrayEnteros1));
        System.out.println(Arrays.deepToString(arrayEnteros1));
        */
    	String[][][] array1 = { { { "alvaro2", "Juan" }, { "alvaro2", "Juan" } },
				{ { "alvaro2", "Juan" }, { "alvaro2", "Juan" } } };
    	System.out.println(Arrays.toString(array1));
    	System.out.println(Arrays.deepToString(array1));
    	System.out.println(Arrays.deepToString(enemigo2));
    }

	public static void main1(String[] args) {

		String[] array = { "alvaro2", "Juan" };
		String[][][] array1 = { { { "alvaro2", "Juan" }, { "alvaro2", "Juan" } },
				{ { "alvaro2", "Juan" }, { "alvaro2", "Juan" } } };
		String[][][][] array2 = {
				{ { { "alvaro2", "Juan" }, { "alvaro2", "Juan" } }, { { "alvaro2", "Juan" }, { "alvaro2", "Juan" } } },
				{ { { "alvaro2", "Juan" }, { "alvaro2", "Juan" } },
						{ { "alvaro2", "Juan" }, { "alvaro2", "Juan" } } } };
		int dato = 4;
		Integer[] dato1 = { 1, 2 };
		Integer[][] dato2 = { { 1, 2 }, { 1, 2 } };
		int[][][] arrayEnteros = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		int[][][] arrayEnteros1 = { { { 1, 2 }, { 3, 4 } } };

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