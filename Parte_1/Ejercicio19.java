import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        int lado;
        double per,altura,area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor del lado del triangulo: ");
        lado = entrada.nextInt();

        per= lado * 3;
        altura=(lado*Math.sqrt(3))/2;
        area=(Math.pow(lado,2)*Math.sqrt(3))/4;

        System.out.println("Perimetro: "+per);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+area);





    }
}
