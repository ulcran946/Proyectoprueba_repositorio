package EXAMEN;

public class ExamenMartinezGael {
    // Declaración de constantes globales
 //   XXX      DIVISOR_BASE = 3;
  //  XXX      EXCEPCION_CARGA = 30;
  //  XXX      FACTOR_MAESTRO = 300;

public static void main(String[] args) {
//Pruebas estáticas predefinidas
System.out.println("Nodo 300 es seguro? " + isNodoSeguro(300));
System.out.println("Nodo 30 es seguro? " + isNodoSeguro(30));
System.out.println("Nodo 9 es seguro? " + isNodoSeguro(9));
System.out.println("Nodo 60 es seguro? " + isNodoSeguro(60));

//Prueba interactiva unitaria
int idPrueba = solicitarNumero("Dame un ID de nodo para comprobar: ");
System.out.println("Nodo " + idPrueba + " es seguro? " + isNodoSeguro(idPrueba));
System.out.println("Escribiste el numero: "+idPrueba);

//Prueba de intervalos y consumo
//Aqui tienes que cambiar a mano los dos numeros por los dos que quieras
analisisNodosEntreDosIDs(1, 10);
}



//TODO: Implementar el método isNodoSeguro
private static boolean isNodoSeguro(int i) {
	//Error en el if del tipo de division
	//if para saber si es divisible entre 3, si es divisible va al if de 30 para ver si solo es divisible entre 3 si es asi da true 
	if (i%3==0) {
	//if para saber si es divisible entre 30, si es va al if de 300 para averiguar si es solo divisible entre 30 o es junto a 300
		if (i%30==0) {
		//if para saber si es divisible entre 300
			if (i%300==0) {
			return true;
			}else {
				return false;
				}
		}else {
			return true;
		}
	}else {
		return false;
	}
}
//TODO: Implementar el método solicitarNumero con control de excepciones
private static int solicitarNumero(String string) {
	//No recuerdo como era el escaner
	//int escaner = Scanner.class;
	//return Scanner.class;
//Numero que tienes que escribir tu
	
	return 3;
}

//TODO: Implementar el método analisisNodosEntreDosIDs
private static void analisisNodosEntreDosIDs(int p, int m) {
	int Maximo = m;
	int id = p;
	while (id < Maximo+1) {
	System.out.println("Nodo " + id + " es seguro? " + isNodoSeguro(id));
	id ++;
	}
	
}

}



