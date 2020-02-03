package entregas;
import java.util.*;

public class Ejercicio4 {
	

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador=0,menu,dineroClub=10000000;
		boolean salir=false;
		ArrayList <String>jugadoresLibres = new ArrayList<>();
		ArrayList <Integer>precioJugadoresLibres = new ArrayList<>();
		ArrayList <String>jugadoresClub = new ArrayList<>();
		ArrayList <Integer>precioJugadoresClub = new ArrayList<>();
		
		llenarJugadores(jugadoresLibres,precioJugadoresLibres);
		
		do{menu = opciones(s);
		
		switch(menu) {
			case 1:
				mostrarJugadoresLibresYPrecios(contador, jugadoresLibres, precioJugadoresLibres);
				System.out.println("¿Desea continuar? true/false");
				salir=s.nextBoolean();
				break;
			case 2:
				mostrarJugadoresClub()
				System.out.println("¿Desea continuar? true/false");
				salir=s.nextBoolean();
				break;
			case 3:
				
				System.out.println("¿Desea continuar? true/false");
				salir=s.nextBoolean();
				break;
			case 4:
				
				System.out.println("¿Desea continuar? true/false");
				salir=s.nextBoolean();
				break;
			case 5:	
				
				System.out.println("¿Desea continuar? true/false");
				salir=s.nextBoolean();
				break;
			case 6:
				break;
				
				
		}
		}while(salir==false);
		
	}

	public static int opciones(Scanner s) {
		int menu;
		do{
			System.out.println("1. Desplegar jugadores libres.");
			System.out.println("2. Jugadores comprados");
			System.out.println("3. Dinero disponible");
			System.out.println("4. Comprar jugador");
			System.out.println("5. Vender jugador");
			System.out.println("6. Salir");
			System.out.println("Seleccione opción:");
			menu=s.nextInt();
		}while(menu<1||menu>6 ||menu==6);
		return menu;
	}

	public static void mostrarJugadoresLibresYPrecios(int contador, ArrayList<String> jugadoresLibres,ArrayList<Integer> precioJugadoresLibres) {
		System.out.println("Estos son los jugadores libres con sus precios:");
		for (String x:jugadoresLibres ) {
			System.out.print(x+": ");
			System.out.println(precioJugadoresLibres.get(contador));
			contador++;
		}
	}

	public static void llenarJugadores(ArrayList<String>jugadoresLibres,ArrayList<Integer>precioJugadoresLibres) {
		Random r = new Random();
		
		jugadoresLibres.add("Figo");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Ronaldo");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Fernando Torres");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Rivaldo");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Robiño");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Ronaldiño");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Guti");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Raúl");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Roberto Carlos");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Makelele");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Roben");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Zidane");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Míchel Salgado");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Samuel Eto'o");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Kaká");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Bautista");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Van Nistelrooy");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Iker Casillas");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Oliver Kahn");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Gianluigi Buffon");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Xavi Hernández");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Carles Puyol");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Thierry Henry");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		jugadoresLibres.add("Fabio Cannavaro");
		precioJugadoresLibres.add(r.nextInt(900000)+100001);
		
	}
}
