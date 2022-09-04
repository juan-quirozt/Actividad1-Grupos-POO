/* Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la 
compra total, según el color de la bolita que el cliente saque al pagar en caja. 
Si la bolita es blanca no se le hará descuento alguno
si es verde se le hará un 10% de descuento
si es amarilla un 25%
si es azul un 50%
si es roja un 100%. 
Hacer un algoritmo para determinar la cantidad final que un cliente deberá pagar por su compra. 
Se sabe que sólo hay bolitas de los colores 
mencionados.  */

// imports
import java.util.*;

// main class
class Almacen {
    /**
     * @param args
     */
    public static void main(String[] args) throws java.lang.Exception {

        try (Scanner sc = new Scanner(System.in)) {
            // datos de entrada
            System.out.println("Ingrese el valor de la compra: ");
            int valcomp = sc.nextInt();
            System.out.println("Ingrese el color de la bolita: ");
            String color = sc.next();
            int valpag, pdes;
            // proceso
            if (color == "blanco") {
                pdes = 0;
            } else if (color == "verde") {
                pdes = 10;
            } else if (color == "amarillo") {
                pdes = 25;
            } else if (color == "azul") {
                pdes = 50;
            } else {
                pdes = 100;
            }
            valpag = valcomp - ((pdes * valcomp) / 100);
            // datos de salida
            System.out.println("El cliente debe pagar: $" + valpag);
        }
    }
}
