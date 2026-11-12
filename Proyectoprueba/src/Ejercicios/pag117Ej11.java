package Ejercicios;

import java.util.Scanner;

public class pag117Ej11 {


		 // TAM: Número máximo de participantes       
		 // D: número de dorsal       
		 // M0, M1, M2: Marca del 2000, 2001, y 2002
		 /* Pagina 117
			 * 11-Se pretende realizar un programa para gestionar la lista de participaciones en una competición de
			salto de longitud. El número de plazas disponible es de 10. Sus datos se irán introduciendo en el
			mismo orden que vayan inscribiéndose los atletas. Diseñar el programa que muestre las siguientes
			opciones:
				1- Inscribir un participante.
				2- Mostrar listado de datos.
				3- Mostrar listado por marcas.
				4- Finalizar el programa.
			Si se selecciona 1, se introducirán los datos de uno de los participantes: Nombre, mejor marca del
			2002, mejor marca del 2001 y mejor marca del 2000.
			Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
			La opción 3 mostrará un listado ordenado por la marca del 2002, de mayor a menor.
			Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la
			opción 4, que terminará el programa.*/
	
	static final int TAM = 10;
	static final int D = 0, M0 = 1, M1 = 2, M2 = 3;
	static Scanner entrada = new Scanner(System.in);
	static int[][] part = new int[TAM][4];
	static int numc = 0;

	public static void main(String[] args) {

		int opc;

		do {
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("1. Inscribir participantes");
			System.out.println("2. Mostrar listado por datos");
			System.out.println("3. Mostrar listado por marcas");
			System.out.println("4. Salir");
			System.out.println("--------------------------------");
			System.out.print("Introduzca una opción: ");

			opc = entrada.nextInt();

			switch (opc) {
			case 1:
				inscribir();
				break;

			case 2:
				ordenarDorsal();
				mostrar();
				break;

			case 3:
				ordenarMarca();
				mostrar();
				break;

			case 4:
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("Opción incorrecta");
			}

		} while (opc != 4);
	}

	public static void inscribir() {

		int dorsal;
		boolean repetido;

		if (numc == TAM) {
			System.out.println("Listado completo");
		} else {

			do {
				System.out.print("Introduzca dorsal: ");
				dorsal = entrada.nextInt();

				repetido = false;

				for (int i = 0; i < numc; i++) {
					if (part[i][D] == dorsal) {
						System.out.println("Dorsal registrado. Inténtelo de nuevo.");
						repetido = true;
					}
				}

			} while (repetido);

			part[numc][D] = dorsal;

			System.out.print("Introduzca marca del 2000: ");
			part[numc][M0] = entrada.nextInt();

			System.out.print("Introduzca marca del 2001: ");
			part[numc][M1] = entrada.nextInt();

			System.out.print("Introduzca marca del 2002: ");
			part[numc][M2] = entrada.nextInt();

			numc++;
		}
	}

	public static void ordenarDorsal() {

		int aux;

		for (int i = 0; i < numc - 1; i++) {
			for (int j = 0; j < numc - 1 - i; j++) {

				if (part[j][D] > part[j + 1][D]) {

					for (int k = 0; k < 4; k++) {
						aux = part[j][k];
						part[j][k] = part[j + 1][k];
						part[j + 1][k] = aux;
					}
				}
			}
		}

		System.out.println("LISTADO DE DATOS SEGÚN DORSAL:");
	}

	public static void ordenarMarca() {

		int aux;

		for (int i = 0; i < numc - 1; i++) {
			for (int j = 0; j < numc - 1 - i; j++) {

				if (part[j][M2] > part[j + 1][M2]) {

					for (int k = 0; k < 4; k++) {
						aux = part[j][k];
						part[j][k] = part[j + 1][k];
						part[j + 1][k] = aux;
					}
				}
			}
		}

		System.out.println("LISTADO POR MARCAS:");
	}

	public static void mostrar() {

		System.out.println("Dorsal - Marcas");

		for (int i = 0; i < numc; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(part[i][j] + " ");
			}
			System.out.println();
		}
	}
}
