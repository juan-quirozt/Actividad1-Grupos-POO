/*18. Se tiene la siguiente información de un empleado:
· código del empleado,
· nombres,
· número de horas trabajadas al mes,
· valor hora trabajada,
· porcentaje de retención en la fuente. */


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
		System.out.println("Ingrese el código del empleado: ");
		codigo = entrada.next();
		System.out.println("Ingrese el número de horas trabajadas en el mes: ");
		nht = entrada.nextInt();
		System.out.println("Ingrese el valor por hora trabajada: ");
		vht = entrada.nextDouble();
		System.out.println("Ingrese el porcentaje de retención en la fuente (como decimal): ");
		porcentaje = entrada.nextDouble();
		
		//Creamos salario bruto y salario neto
		
		double salario_bruto, salario_neto; 
		
		salario_bruto = nht * vht;
		salario_neto = salario_bruto - (porcentaje*salario_bruto);
		
		System.out.println("El empleado con código " + codigo + ", llamado " + nombres + ", tiene un salario bruto de $" + salario_bruto + " y un salario neto de $" + salario_neto);
		
		entrada.close();
	}
}
