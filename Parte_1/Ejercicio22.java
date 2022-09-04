/* Ejercicio propuesto #22
 *  Elaborar un algoritmo que entre el nombre de un empleado, su salario b�sico por hora y el
n�mero de horas trabajadas en el mes; escriba su nombre y salario mensual si �ste es mayor
de $450.000, de lo contrario escriba s�lo el nombre. */


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
		System.out.println("Ingrese su salario b�sico por hora: ");
		salario_hora = entrada.nextInt();
		System.out.println("Ingrese el n�mero de horas trabajadas en el mes: ");
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