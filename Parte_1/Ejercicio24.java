/*Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es 
la esfera de mayor peso.  */

import java.util.*;
public class ejercicio_24 {
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
        // proceso

        if ((pesoA > pesoB) && (pesoA > pesoC)) {
            System.out.println("La esfera A es la de mayor peso");
        } else if ((pesoB > pesoA) && (pesoB > pesoC)){
            System.out.println("La esfera B es la de mayor peso");
        } else {
            System.out.println("La esfera C es la de mayor peso");
        }
    }
}

