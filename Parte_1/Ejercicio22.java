/* Ejercicio propuesto #22
 *  Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre. */


import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args) {
		
		//variables
		String nombres;
		double salario_hora;
		int nht;

		
		//Leer los datos
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nombre del empleado: ");
		nombres = entrada.nextLine();		
		System.out.println("Ingrese su salario básico por hora: ");
		salario_hora = entrada.nextInt();
		System.out.println("Ingrese el número de horas trabajadas en el mes: ");
		nht = entrada.nextInt();

		double salario = salario_hora * nht;
		
		if (salario > 450000) {
			System.out.println("Nombre: " + nombres);
			System.out.println("Salario mensual: $" + salario);
		}

		else {
			System.out.println("Nombre: " + nombres);
		}
		
		entrada.close();
	}
}