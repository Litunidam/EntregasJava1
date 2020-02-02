package entregas;

import java.util.*;

public class Ejercicio3 {

	public static int  mostrarMenu(int menu) {
		Scanner s = new Scanner(System.in);
		System.out.println("1. Añadir un proceso a la cola.");
		System.out.println("2. Permitir el acceso de un proceso.");
		System.out.println("3. Salir.");
		System.out.println("Elija opción");
		menu=s.nextInt();
		while(menu<1 || menu>3) {
			System.out.println("Introduzca un número válido (entre el 1 y el 3)");
			menu=s.nextInt();
		}
		
		return menu;
	}
	public static void añadirProceso(ArrayList<String>procesos) {
		
		
		
	}
	public static void accesoProceso(ArrayList<String>procesos) {
		
		
		
	}
	public static void main(String[] args) {
		ArrayList<String>procesos=new ArrayList<>();
		
		int menu = 0;
		
		while(menu!=3) {
			
			mostrarMenu(menu);
			switch(menu) {
			case 1:
				añadirProceso(procesos);
				break;
			case 2:
				accesoProceso(procesos);
				break;
				
			case 3:
				break;
			}
			
			
			
		}
		
		
	}
}
