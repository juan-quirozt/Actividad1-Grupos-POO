/*18. Se tiene la siguiente informaci�n de un empleado:
� c�digo del empleado,
� nombres,
� n�mero de horas trabajadas al mes,
� valor hora trabajada,
� porcentaje de retenci�n en la fuente. */


import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		
		//variables
		String codigo, nombres;
		int nht;
		double vht;
		double porcentaje;
		
		//Leer los datos
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nombre del empleado: ");
		nombres = entrada.nextLine();		
		System.out.println("Ingrese el c�digo del empleado: ");
		codigo = entrada.next();
		System.out.println("Ingrese el n�mero de horas trabajadas en el mes: ");
		nht = entrada.nextInt();
		System.out.println("Ingrese el valor por hora trabajada: ");
		vht = entrada.nextDouble();
		System.out.println("Ingrese el porcentaje de retenci�n en la fuente (como decimal): ");
		porcentaje = entrada.nextDouble();
		
		//Creamos salario bruto y salario neto
		
		double salario_bruto, salario_neto; 
		
		salario_bruto = nht * vht;
		salario_neto = salario_bruto - (porcentaje*salario_bruto);
		
		System.out.println("El empleado con c�digo " + codigo + ", llamado " + nombres + ", tiene un salario bruto de $" + salario_bruto + " y un salario neto de $" + salario_neto);
		
		entrada.close();
	}
}
