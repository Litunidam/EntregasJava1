package entregas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		ArrayList<String> procesos = new ArrayList<>();
		ArrayList<Integer> duracionProcesos = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		int menu = 0;
		int cantidad = -1;
		int q = 1;
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
				s.nextLine();
			}
			switch (menu) {
			case 1:
				if (cantidad >= 100) {
					System.out.println("No se admiten más de 100 procesos en el sistema");
					break;
				}

				cantidad++;
				if (procesos.isEmpty())
					cantidad = 0;
				System.out.println("Ha escogido 'Añadir un proceso', ahora introduzca el nombre del proceso:");
				procesos.add(s.nextLine());
				System.out.println("Introduzca la duración del proceso:");
				duracionProcesos.add(s.nextInt());
				s.nextLine();
				break;
			case 2:
				if (procesos.size() == 0) {
					System.out.println("No hay procesos");
				} else if (procesos.size() == 1) {
					if (duracionProcesos.get(0) == 0) {
						System.out.println("Se ha terminado de procesar el proceso: " + procesos.get(0));
						System.out.println("");
						procesos.remove(0);
						duracionProcesos.remove(0);
						break;
					}
					duracionProcesos.set(0, (duracionProcesos.get(0) - 1));
					System.out.println("Se está procesando el proceso " + procesos.get(0));
					System.out.println("Al proceso le quedan " + duracionProcesos.get(0) + " ciclos.");
					System.out.println("");
				} else if (procesos.size() > 1) {
					if (q == 1) {
						System.out.println("Se está procesando el proceso: " + procesos.get(0));
						if (duracionProcesos.get(0) == 0) {
							System.out.println("Se ha terminado de procesar el proceso: " + procesos.get(0));
							System.out.println("");
							procesos.remove(0);
							duracionProcesos.remove(0);
						}
						duracionProcesos.set(0, (duracionProcesos.get(0) - 1));
						System.out.println("Al proceso le quedan " + duracionProcesos.get(0) + " ciclos.");
						System.out.println("");
						q++;
					} else if (q == 2) {
						q = 1;
						System.out.println("Se está procesando el proceso: " + procesos.get(1));
						if (duracionProcesos.get(1) == 0) {
							System.out.println("Se ha terminado de procesar el proceso: " + procesos.get(1));
							System.out.println("");
							procesos.remove(1);
							duracionProcesos.remove(1);
						}
						duracionProcesos.set(1, (duracionProcesos.get(1) - 1));
						System.out.println("Al proceso le quedan " + duracionProcesos.get(1) + " ciclos.");
						System.out.println("");
					}
				}
				break;

			case 3:
				break;
			}

		}

		s.close();

	}

}
