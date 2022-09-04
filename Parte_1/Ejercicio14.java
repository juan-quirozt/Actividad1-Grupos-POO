
/*Una empresa con tres departamentos tiene establecido un plan de incentivos para sus 
vendedores. Al final del período, a cada departamento se le pide el importe global de las 
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al 
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las 
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos: 
• Ventas del departamento 1 
• Ventas del departamento 2 
• Ventas del departamento 3 
• Salario de los vendedores de cada departamento */
// imports
import java.util.*;

class Empresa {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);
        // datos de entrada
        System.out.println("Ventas dpto 1: ");
        double vd1 = sc.nextDouble();
        System.out.println("Ventas dpto 2: ");
        double vd2 = sc.nextDouble();
        System.out.println("Ventas dpto 3: ");
        double vd3 = sc.nextDouble();
        System.out.println("Salario: ");
        double salar = sc.nextDouble();
        double totven, porven, salar1, salar2, salar3;

        // proceso
        totven = vd1 + vd2 + vd3;
        porven = 0.33 * totven;
        if (vd1 > porven) {
            salar1 = salar + (0.2 * salar);
        } else {
            salar1 = salar;
        }
        if (vd2 > porven) {
            salar2 = salar + (0.2 * salar);
        } else {
            salar2 = salar;
        }
        if (vd3 > porven) {
            salar3 = salar + (0.2 * salar);
        } else {
            salar3 = salar;
        }

        System.out.println("Salario vendedores dpto 1: " + salar1 + ", salario vendedores dpto 2: " + salar2
                + ", salario vendedores dpto 3: " + salar3);
    }
}
