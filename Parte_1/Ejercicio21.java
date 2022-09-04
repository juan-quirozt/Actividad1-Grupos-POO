import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        int a,b,c;
        double perimetro,semiper,area;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Valor del lado a: ");
        a= entrada.nextInt();
        System.out.println("Valor del lado b: ");
        b= entrada.nextInt();
        System.out.println("Valor del lado del c: ");
        c= entrada.nextInt();

        perimetro= a+b+c;
        semiper=perimetro/2;
        area=Math.sqrt(semiper*(semiper-a)*(semiper-b)*(semiper-c)); //Utilizando la formula de heron se calcula el area
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
        System.out.println("Semiperimetro: "+semiper);





    }
}
