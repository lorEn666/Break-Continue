package breakContinue;

import java.util.Scanner;

public class CasosDePrueba {

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
		int intentos = 3;

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

		System.out.println("Aquí continuaría el programa.");
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
								System.out.println("Bloque 6º. No se ejecuta.");
							}
							System.out.println("Bloque 5º. No se ejecuta.");
						}
						System.out.println("Bloque 4º. No se ejecuta.");
					}
					System.out.println("Bloque 3º. No se ejecuta.");
				}
				System.out.println("Bloque 2º. No se ejecuta.");
			}
			System.out.println("Bloque 1º. Se ejecuta. aux vale: " + aux);
		}
	}
}
