package entregas;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1 {

	public static void Swap(String[] diccionario, int i, int j) {
		String auxiliar;
		auxiliar = diccionario[i];
		diccionario[i] = diccionario[j];
		diccionario[j] = auxiliar;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n;

		System.out.println("Introduzca la dimensión del diccionario");
		n = s.nextInt();
		while (n < 0) {
			System.out.println("La dimensión no puede ser negativa, introduzca un número negativo");
			n = s.nextInt();
		}

		// El siguiente s.nextLine() es porque se comía la primera palabra.
		s.nextLine();

		String[] diccionario = new String[n];
		System.out.println("Ahora inserte las palabras");
		for (int i = 0; i < n; i++) {
			diccionario[i] = s.nextLine();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (diccionario[i].compareToIgnoreCase(diccionario[j]) > 0) {
					Swap(diccionario, i, j);
				}
			}
		}
		System.out.println(Arrays.toString(diccionario));

		s.close();
	}

}
