package entregas;

import java.util.*;

public class Ejercicio4 {

	static int dineroClub = 10000000;
	static ArrayList<String> jugadoresLibres = new ArrayList<>();
	static ArrayList<Integer> precioJugadoresLibres = new ArrayList<>();
	static ArrayList<String> jugadoresClub = new ArrayList<>();
	static ArrayList<Integer> precioJugadoresClub = new ArrayList<>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0, menu;
		boolean salir = false;
		llenarJugadores(jugadoresLibres, precioJugadoresLibres);
		do {
			menu = opciones(s);

			switch (menu) {
			case 1:
				mostrarJugadoresLibresYPrecios(contador);
				System.out.println("¿Desea continuar? true/false");
				salir = s.nextBoolean();
				s.nextLine();
				break;
			case 2:
				mostrarJugadoresClub();
				System.out.println("¿Desea continuar? true/false");
				salir = s.nextBoolean();
				s.nextLine();
				break;
			case 3:
				System.out.println("Este es el dinero que dispone el club: " + dineroClub);
				System.out.println("¿Desea continuar? true/false");
				salir = s.nextBoolean();
				s.nextLine();
				break;
			case 4:
				comprarJugador(s);
				System.out.println("¿Desea continuar? true/false");
				salir = s.nextBoolean();
				break;
			case 5:
				venderJugador(s);
				System.out.println("¿Desea continuar? true/false");
				salir = s.nextBoolean();
				s.nextLine();
				break;
			case 6:

				break;

			}
		} while (salir == true);

	}

	// Este método muestra el menú
	public static int opciones(Scanner s) {
		int menu;
		do {
			System.out.println("1. Desplegar jugadores libres.");
			System.out.println("2. Jugadores comprados");
			System.out.println("3. Dinero disponible");
			System.out.println("4. Comprar jugador");
			System.out.println("5. Vender jugador");
			System.out.println("6. Salir");
			System.out.println("Seleccione opción:");
			menu = s.nextInt();
			s.nextLine();
		} while (menu < 1 || menu > 6);
		return menu;
	}

	// Función que muestra los jugadores libres con sus precios
	public static void mostrarJugadoresLibresYPrecios(int contador) {
		System.out.println("Estos son los jugadores libres con sus precios:");
		for (String x : jugadoresLibres) {
			System.out.print(x + ": ");
			System.out.println(precioJugadoresLibres.get(contador) + "€");
			contador++;
		}
	}

	// Función que muestra los jugadores que tiene el club
	public static void mostrarJugadoresClub() {
		if (jugadoresClub.isEmpty()) {
			System.out.println("Su club no tiene ningún jugador comprado");
		} else {
			int contador = 0;
			System.out.println("Estos son los jugadores de su club:");
			for (String x : jugadoresClub) {
				System.out.print(x + ": ");
				System.out.println(precioJugadoresClub.get(contador));
				contador++;
			}
		}
	}

	// Fución comprar jugador
	public static void comprarJugador(Scanner s) {
		String comprado;
		System.out.println("Ha seleccionado: Comprar jugador.");
		System.out.println("Introduzca el nombre del jugador que desea comprar:");
		comprado = s.nextLine();
		if (jugadoresLibres.contains(comprado)) {
			if (precioJugadoresLibres.get(jugadoresLibres.indexOf(comprado)) > dineroClub) {
				System.out.println("El club no dispone del suficiente dinero para comprar ese jugador");
			} else {
				dineroClub = dineroClub - (precioJugadoresLibres.get(jugadoresLibres.indexOf(comprado)));
				jugadoresClub.add(comprado);
				precioJugadoresClub.add(precioJugadoresLibres.get(jugadoresLibres.indexOf(comprado)));
				precioJugadoresLibres.remove(jugadoresLibres.indexOf(comprado));
				jugadoresLibres.remove(comprado);

			}

		} else {
			System.out.println("No hay ningún jugador con ese nombre");
		}

	}

	// Funcion vender jugador
	public static void venderJugador(Scanner s) {
		String vender;
		if (jugadoresClub.isEmpty()) {
			System.out.println("El club no tiene ningún jugador que se pueda vender");
		} else {

			System.out.println("Ha seleccionado: Vender jugador.");
			System.out.println("Introduzca el nombre del jugador que desea vender:");
			vender = s.nextLine();
			if (jugadoresClub.contains(vender)) {
				dineroClub += precioJugadoresClub.get(jugadoresClub.indexOf(vender));
				jugadoresLibres.add(vender);
				precioJugadoresLibres.add(precioJugadoresClub.get(jugadoresClub.indexOf(vender)));
				precioJugadoresClub.remove(jugadoresClub.indexOf(vender));
				jugadoresClub.remove(vender);

			} else
				System.out.println("El club no tiene a ese jugador.");
		}
	}

	// Función inicial para rellenar el array con los jugadores
	public static void llenarJugadores(ArrayList<String> jugadoresLibres, ArrayList<Integer> precioJugadoresLibres) {
		Random r = new Random();
		String[] nombres = { "Figo", "Ronaldo", "Fernando Torres", "Rivaldo", "Robiño", "Ronaldiño", "Guti", "Raúl",
				"Roberto Carlos", "Makelele", "Roben", "Zidane", "Míchel Salgado", "Samuel Eto'o", "Kaká", "Bautista",
				"Van Nistelrooy", "Iker Casillas", "Oliver Kahn", "Gianluigi Buffon", "Xavi Hernández", "Carles Puyol",
				"Thierry Henry", "Fabio Cannavaro" };
		for (int i = 0; i < nombres.length; i++) {
			jugadoresLibres.add(nombres[i]);
			precioJugadoresLibres.add(r.nextInt(900000) + 100001);
		}
	}
}