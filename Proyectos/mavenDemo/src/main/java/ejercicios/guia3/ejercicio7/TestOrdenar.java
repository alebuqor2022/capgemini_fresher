package ejercicios.guia3.ejercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class TestOrdenar {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int longitud;
		int[] numeros;

		// Pido al usuario que ingrese una longitud para el Array.
		longitud = validarLongitud();

		// Ingreso los numeros del Array, con la longitud establecida.
		numeros = ingresarDatos(longitud);
		
		//Muestro el Array ordenado de forma ascendente.
		ordenarArray(numeros);
		
		// Dado un elemento verifico cuantos elementos menores tengo.
		verMenores(numeros);

	}

	public static int validarLongitud() {
		int length;
		do {
			System.out.print("Ingrese el la longitud de su Array: ");
			length = in.nextInt();
			if (length <= 0) {
				System.out.println("La longitud del Array debe ser mayor a '0'.");
			}
			if (length > 10) {
				System.out.println("La longitud del Array debe ser menor a '10'.");
			}

		} while (length <= 0 || length > 10);

		return length;
	}

	public static int[] ingresarDatos(int longitud) {
		int[] array = new int[longitud];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Ingrese el numero " + (i + 1) + " :");
			array[i] = in.nextInt();
		}

		return array;
	}

	public static void ordenarArray(int[] n) {
		System.out.println("");

		// Utilizo el metodo sort para ordenar.
		Arrays.sort(n);

		System.out.print("[ ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);

			// Imprimo una coma hasta la anteultima iteracion.
			if (i < n.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print(" ].\n");
	}

	public static void verMenores(int[] arr) {
		System.out.print("Ingrese el numero que desea buscar: ");
		int x =in.nextInt();
		int menores = Arrays.binarySearch(arr, x);
		
		if(menores == 0) {
			System.out.println("No hay numeros menores a " + x  +" en el Array.");
		}else if(menores > 0) {			
			System.out.println("Existen "+ menores + " numeros menores a " + x + " en el Array.");	
		}else {
			System.out.println("No existe el numero " + x + " en el Array.");
		}
	}
}
