package Ejercicios;

public class pag117Ej11 {

	 public static void main(String[] args) {      
		 final int TAM=10,D=0,M0=1,M1=2,M2=3;      
		 // TAM: Número máximo de participantes       
		 // D: número de dorsal       
		 // M0, M1, M2: Marca del 2000, 2001, y 2002
		 int fv=0;
		 while (fv!=4) {
			 System.out.println("--------------");
			 System.out.println("1. Inscribir participantes");
			 System.out.println("2. Mostrar listado por datos");
			 System.out.println("3. Mostrar listado por marcas");
			 System.out.println("4. Salir");
			 System.out.println("--------------");
			 int opc=Entrada.entero();
			 switch(opc) {
			 case 1:
				 Inscribir
			 case 2:
				 Datos
			 case 3:
				 Marcas
			 case 4:
				 Salir
			 }
		 }
		 System.out.println("FIN");
	 }
	 
	 
	 
	 
	 
}
