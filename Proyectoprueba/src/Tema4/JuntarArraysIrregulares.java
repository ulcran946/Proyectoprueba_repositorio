package Tema4;

public class JuntarArraysIrregulares {

	
	public static int[][] precesarArrays(int[][] a, int[][] b){
		int filasMax=a.length;
		if (b.length>a.length) {
			filasMax=b.length;
		}
		int[][] resultado =new int[filasMax][];
		for (int filas=0;filas<filasMax;filas++) {
			int columnasMaximas=0;
			if (a.length>=filas && b.length>=filas) {
				columnasMaximas=a[filas].length;
				if (b[filas].length>a[filas].length) {
					columnasMaximas=b[filas].length;
				}
			}else if (a.length>=filas) {
				columnasMaximas=a[filas].length;				
			}else if  (b.length>=filas) {
				columnasMaximas=b[filas].length;
			}
			int[] datosColumna= new int[columnasMaximas];
			
			for (int columnas=0;columnas<columnasMaximas;columnas++) {
				int valor=0;
				if (a[filas].length>=columnas && b[filas].length>=columnas) {
					valor=a[filas][columnas];
					if (valor<b[filas][columnas]) {
						valor=b[filas][columnas];
					}
				}else if(a[filas].length>=columnas) {
			    	valor=a[filas][columnas];
			    }else if (b[filas].length>=columnas) {
			    	valor=b[filas][columnas];
			    }
			
				datosColumna[columnas]=valor;
				
			}
			resultado[filas]=datosColumna;
			
			
			
			
			
			
			
			
			
		}
		
		
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
