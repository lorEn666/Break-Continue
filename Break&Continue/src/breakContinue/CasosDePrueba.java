package breakContinue;

import java.util.Scanner;

public class CasosDePrueba {

	public static void casoBasico() {

		System.out.println("Sentencia break\n");

		for (int i = 1; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println("N�mero par encontrado.");
				break;
			}
			System.out.println("N�mero par no encontrado.");
		}

		System.out.println("\nSentencia continue\n");

		for (int i = 1; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println("N�mero par encontrado.");
				continue;
			}
			System.out.println("N�mero par no encontrado.");
		}
	}

	public static void casoAvanzado() {
		/*
		 * Se leer� un nombre por teclado y se comprobar� que no contenga n�meros ni
		 * car�cteres especiales, que no est� vac�o y que no exceda los 8 car�cteres. Si
		 * el nombre no es correcto, el programa pedir� uno nuevo hasta que la
		 * estructura sea correcta.
		 */

		Scanner leer = new Scanner(System.in);
		String nombre;
		String comprobacionNombre = " 1234567890��!|�@#$%&�/()=?'��`^*+][��}{�-_.:,;<>\\";
		int intentos = 3;

		do {

			System.out.println("Introduzca nombre (m�ximo 8 car�cteres):");
			nombre = leer.nextLine();

			if (nombre.length() > 8) {
				System.err.println("Error. El nombre no puede exceder los 8 car�cteres. Inserte un dato v�lido.");
				continue;
			}

			if (nombre.isEmpty()) {
				System.err.println(
						"Error. La inserci�n de datos debe contener al menos un car�cter. Inserte un dato v�lido.");
				continue;
			}

			for (int i = 0; i < nombre.length(); i++) {

				for (int j = 0; j < comprobacionNombre.length(); j++) {

					if (nombre.substring(i, i + 1).equalsIgnoreCase(comprobacionNombre.substring(j, j + 1))) {
						System.err.println(
								"Error. El nombre no puede contener datos num�ricos, car�cteres especiales ni espacios. Sea m�s preciso.");
						nombre = "";
						intentos--;

						if (intentos == 0) {

							break;

						} else if (intentos > 0) {

							break;

						}
					}
				}
			}

		} while ((nombre.length() > 8) || (nombre.equalsIgnoreCase("")));

		if (intentos == 0) {
			System.out.println("Ha agotado todos los intentos.");
			System.exit(0);
		}

		System.out.println("Aqu� continuar�a el programa.");
	}

	public static void casoExperto() {
		boolean control = true;
		int aux = 0;

		primero: {
			aux++;

			segundo: {
				aux++;

				tercero: {
					aux++;

					cuarto: {
						aux++;

						quinto: {
							if (control) {
								break segundo;
							}

							sexto: {
								aux++;
								System.out.println("Bloque 6�. No se ejecuta.");
							}
							System.out.println("Bloque 5�. No se ejecuta.");
						}
						System.out.println("Bloque 4�. No se ejecuta.");
					}
					System.out.println("Bloque 3�. No se ejecuta.");
				}
				System.out.println("Bloque 2�. No se ejecuta.");
			}
			System.out.println("Bloque 1�. Se ejecuta. aux vale: " + aux);
		}
	}
}
