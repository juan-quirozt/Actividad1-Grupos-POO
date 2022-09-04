
/*. Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado, 
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. */
import java.util.*;
import java.lang.Math;

public class ejercicio_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // datos de entrada
        System.out.println("Ecuación de segundo grado de la forma ax2+bx+c=0");
        System.out.println("Ingrese el valor de A: ");
        double coefA = sc.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        double coefB = sc.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        double coefC = sc.nextDouble();
        double x1, x2;
        // proceso
        x1 = (-coefB + Math.sqrt((Math.pow(coefB, 2)) - (4 * coefA * coefC))) / (2 * coefA);
        x2 = (-coefB - Math.sqrt((Math.pow(coefB, 2)) - (4 * coefA * coefC))) / (2 * coefA);
        // salida
        System.out.println("La raíz X1 = " + Math.round(x1) + " y la raíz X2 = " + Math.round(x2));
    }
}
