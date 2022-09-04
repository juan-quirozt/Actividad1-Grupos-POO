import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        int  ES,PAT;
        String NI,NOM;
        double PAGMAT=50000;
        Scanner entrada =new Scanner(System.in);
        System.out.println("Numero de inscripcion: ");
        NI= entrada.nextLine();
        System.out.println("Nombres: ");
        NOM= entrada.nextLine();
        System.out.println("Patrimonio: ");
        PAT= entrada.nextInt();
        System.out.println("Estrato social: ");
        ES= entrada.nextInt();
        if ((PAT>2000000)&&(ES>3)){
            PAGMAT= PAGMAT +0.03*PAT;
        }
        System.out.println("El estudiante con numero de inscripcion "+ NI+" y nombre "+NOM+" debe pagar $"+PAGMAT);
    }
}
