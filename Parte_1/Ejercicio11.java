/* Ejercicio resuelto #12
 * Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
ellos. */

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); //Leamos los datos
		
		int N1, N2, N3;
		int mayor;
		System.out.println("Ingrese el valor de N1: ");		
		N1 = entrada.nextInt();
		System.out.println("Ingrese el valor de N2: ");
		N2 = entrada.nextInt();
		System.out.println("Ingrese el valor de N3: ");
		N3 = entrada.nextInt();
		
		if ( (N1 > N2) && (N1 > N3 ) )  {
			mayor = N1;
		}
		
		else if ( (N2 > N3) ) {
			mayor = N2;
		}
		
		else {
			mayor = N3;
		}
		
		System.out.println("El valor mayor entre: " + N1 + ", " + N2 + " y " + N3 + " es: " + mayor);
		entrada.close();
	}
}
