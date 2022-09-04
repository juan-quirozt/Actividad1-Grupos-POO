/* Ejercicio resuelto #12
Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo. */


import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		int nht; //Número de horas trabajadas
		String nom; //Nombre del trabajador
		double vhn;    //Valor hora normal trabajada
		
		Scanner entrada = new Scanner(System.in); //Leer los datos por pantalla
		System.out.println("Ingrese los nombres del trabajador: ");
		nom = entrada.nextLine();
		System.out.println("Ingrese el número de horas trabajadas: ");
		nht = entrada.nextInt();
		System.out.println("Ingrese el valor de hora normal trabajada: ");
		vhn = entrada.nextDouble();
		
		//Vamos a crear unas variables para hacer los cálculos
		
		int het; //número de horas extras trabajadas
		int hee8; //número de horas extras que se exceden de las 8;
		double salario; //Pago total del trabajador
		
		if (nht > 40 ) {	   // ¿El trabajador tiene horas extras?	
			het = nht - 40;    //Calculamos las horas extras
			if (het > 8) {	   //Verificamos si son más de 8 horas extras
				hee8 = het - 8;   
				salario = (40*vhn) + (8*2*vhn) + (hee8*3*vhn);
			}
			
			else {
				salario = (40*vhn) + (het*2*vhn);
			}
		}
		
		else {
			salario = nht*vhn;
		}
		
		
		System.out.println("El trabajador " + nom + " devengó: $" + salario);
		entrada.close();
	}
}