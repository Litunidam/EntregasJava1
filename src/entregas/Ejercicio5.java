package entregas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		ArrayList<String> procesos = new ArrayList<>();
		ArrayList<Integer> duracionProcesos = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		int menu = 0;
		int indice = -1;

		while (menu != 3) {

			System.out.println("1. Añadir un proceso a la cola.");
			System.out.println("2. Permitir el acceso de un proceso.");
			System.out.println("3. Salir.");
			System.out.println("Elija opción");
			menu = s.nextInt();
			s.nextLine();
			while (menu < 1 || menu > 3) {
				System.out.println("Introduzca un número válido (entre el 1 y el 3)");
				menu = s.nextInt();
			}
			switch (menu) {
			case 1:
				if (indice > 100) {
					System.out.println("No se admiten más de 100 procesos en el sistema");
					break;
				}
				System.out.println("Ha escogido 'Añadir un proceso', ahora introduzca el nombre del proceso:");
				procesos.add(s.nextLine());
				if(procesos.isEmpty()) 
					indice=0;
				System.out.println("Introduzca la duración del proceso:");
				duracionProcesos.add(s.nextInt());
				s.nextLine();
				break;
			case 2:
				if(indice!=-1) {
					System.out.println("Se acaba de procesar el proceso con nombre '" + procesos.get(0) + "'");
					System.out.println("");
					procesos.remove(0);
				}else
					System.out.println("No hay ningún proceso en la cola");
					System.out.println("");
				break;

			case 3:
				break;
			}

		}

		s.close();
		
		
		
		
		
	}
	
}
