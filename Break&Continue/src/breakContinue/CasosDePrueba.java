package breakContinue;

import java.util.Scanner;

public class CasosDePrueba {

	public static void casoSinSentido() {

		System.out.println("Sentencia break\n");

		for (int i = 1; i < 5; i++) {
			System.out.println("Veces que se ejecuta el bucle: " + i);
			break; // Rompe el bucle
		}

		System.out.println("\nSentencia continue\n");

		for (int i = 1; i < 5; i++) {
			System.out.println("Veces que se ejecuta el bucle: " + i);
			continue; // Sale de la iteración actual y salta a la siguiente
		}
	}

	public static void casoBasico() {

		System.out.println("Sentencia break\n");

		for (int i = 1; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println("Número par encontrado.");
				break;
			}
			System.out.println("Número par no encontrado.");
		}

		System.out.println("\nSentencia continue\n");

		for (int i = 1; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println("Número par encontrado.");
				continue;
			}
			System.out.println("Número par no encontrado.");
		}
	}

	public static void casoAvanzado() {
		/*
		 * Se leerá un nombre por teclado y se comprobará que no contenga números ni
		 * carácteres especiales, que no esté vacío y que no exceda los 8 carácteres. Si
		 * el nombre no es correcto, el programa pedirá uno nuevo hasta que la
		 * estructura sea correcta.
		 */

		Scanner leer = new Scanner(System.in);
		String nombre;
		String comprobacionNombre = " 1234567890ªº!|·@#$%&¬/()=?'¿¡`^*+][¨´}{Ç-_.:,;<>\\";

		do {
			System.out.println("Introduzca nombre (máximo 8 carácteres):");
			nombre = leer.nextLine();
			if (nombre.length() > 8) {
				System.err.println("Error. El nombre no puede exceder los 8 carácteres. Inserte un dato válido.");
				continue;
			}
			if (nombre.isEmpty()) {
				System.err.println(
						"Error. La inserción de datos debe contener al menos un carácter. Inserte un dato válido.");
				continue;
			}

			for (int i = 0; i < nombre.length(); i++) {
				for (int j = 0; j < comprobacionNombre.length(); j++) {
					if (nombre.substring(i, i + 1).equalsIgnoreCase(comprobacionNombre.substring(j, j + 1))) {
						System.err.println(
								"Error. El nombre no puede contener datos numéricos, carácteres especiales ni espacios. Sea más preciso.");
						nombre = "";
						break;
					}
				}
			}
		} while ((nombre.length() > 8) || (nombre.equalsIgnoreCase("")));

		System.out.println("Bucle roto");
	}

	public static void preIncrementoYpostIncremento() {
		int x = 1;

		System.out.println(x++); // x vale 1 y la expresión vale 2
		System.out.println(x); // x vale 2

//		System.out.println(++x); // x vale 2 y la expresión vale 2
//		System.out.println(x); // x vale 2
	}
}
