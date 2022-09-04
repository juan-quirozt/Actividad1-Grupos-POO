import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        double A,B;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Valor de A: ");
        A= entrada.nextDouble();
        System.out.println("Valor de B: ");
        B= entrada.nextDouble();

        if (A > B){
            System.out.println("A es mayor a B");
        }
        else if (A==B){
            System.out.println("A es igual a B");
        }
        else {
            System.out.println("A es menor a B");
        }

    }
}
