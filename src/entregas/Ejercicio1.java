package entregas;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduzca la dimensión del diccionario");
		
		n=s.nextInt();
		String [] diccionario = new String [n];
		
		for (int i=0;i<n; i++) {
			diccionario[i]=s.nextLine();
		}
		  
		
		
		s.close();
	}
}
