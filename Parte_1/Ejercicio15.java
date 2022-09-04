
/* Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una 
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor 
o menor peso. */
// imports
import java.util.*;

public class ejercicio_15 {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);
        // datos de entrada
        System.out.println("Ingrese el peso de la esfera A: ");
        int pesoA = sc.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        int pesoB = sc.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        int pesoC = sc.nextInt();
        System.out.println("Ingrese el peso de la esfera D: ");
        int pesoD = sc.nextInt();

        // proceso
        if ((pesoA == pesoB) && (pesoA == pesoC)) {
            System.out.println("La esfera D es la diferente");
            if (pesoD > pesoA) {
                System.out.println("La esfera D es de mayor peso");
            } else {
                System.out.println("La esfera D es de menor peso");
            }
        } else {
            if ((pesoA == pesoB) && (pesoA == pesoD)) {
                System.out.println("La esfera C es la diferente");
                if (pesoC > pesoA) {
                    System.out.println("La esfera C es de mayor peso");
                } else {
                    System.out.println("La esfera C es de menor peso");
                }
            } else {
                if ((pesoA == pesoC) && (pesoA == pesoB)) {
                    System.out.println("La esfera B es la diferente");
                    if (pesoB > pesoD) {
                        System.out.println("La esfera B es de mayor peso");
                    } else {
                        System.out.println("La esfera B es de menor peso");
                    }
                } else {
                    System.out.println("La esfera A diferente");
                    if (pesoA > pesoB) {
                        System.out.println("La esfera A es de mayor peso");
                    } else {
                        System.out.println("La esfera A es de menor peso");
                    }
                }
            }
        }
    }
}
