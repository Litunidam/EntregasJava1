package entregas;

import java.util.Random;

public class Ejercicio2 {
	// Mítica función para hacerlo más interactivo
	private static void delaySegundo() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		Random r = new Random();
		int sueldos[][][] = new int[3][4][5];
		int mediaSueldos[][] = new int[3][4];
		int max=0;
		int imax=0,jmax=0;
		
		// Inicializamos el array tridimensional para introducir los sueldos
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 5; k++) {
					sueldos[i][j][k] = r.nextInt(1000) + 1000;
					mediaSueldos[i][j] += sueldos[i][j][k];

				}
				// Pongo aquí la media porque si no se quedaba algún número perdido porque son
				// de tipo int
				mediaSueldos[i][j] = mediaSueldos[i][j] / 5;
			}
		}
		for (int i = 0; i < 3; i++) {
			delaySegundo();
			System.out.println("	EMPRESA " + (i + 1) + ":");
			for (int j = 0; j < 4; j++) {
				delaySegundo();
				System.out.println("");
				System.out.println("   Sueldos empleado " + (j + 1));
				System.out.println("");
				for (int k = 0; k < 5; k++) {
					delaySegundo();
					System.out.print(sueldos[i][j][k] + "€");
					System.out.print("  ");
				}
				System.out.println("");
			}
			System.out.println("");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("EMPRESA " + (i + 1));
			delaySegundo();
			for (int j = 0; j < 4; j++) {
				delaySegundo();
				System.out.println("");
				System.out.println("Media sueldos empleado " + (j + 1) + ": " + mediaSueldos[i][j] + "€");
				System.out.println("");
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if(mediaSueldos[i][j]>max) {
					max=mediaSueldos[i][j];
					imax=i;
					jmax=j;
				}
			}
		}
		
		System.out.println("El empleado con el sueldo más alto es: "+max+" y sus índices son: ["+imax+","+jmax+"]");
		
		
		
	}
}
