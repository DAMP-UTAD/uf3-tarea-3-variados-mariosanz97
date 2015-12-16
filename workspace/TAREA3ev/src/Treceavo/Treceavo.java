package Treceavo;

import java.util.Scanner;

public class Treceavo {

	public static void main(String[] args) {

		Scanner sueldos = new Scanner(System.in);

		System.out.print("Sueldo: ");
		int sueldo = sueldos.nextInt();

		System.out.print("Años : ");
		int años = sueldos.nextInt();

		if (sueldo < 500 & años >= 10) {

			int sueldoa = (sueldo * 20 / 100) + sueldo;
			System.out.println("Tiene un aumento del 20% ");
			System.out.println("Su sueldo ahora es: " + sueldoa);

		} else if (sueldo < 500 & años < 10) {

			int sueldob = (sueldo * 5 / 100) + sueldo;

			System.out.println("Tiene un aumento del 5% ");
			System.out.println("Su sueldo ahora es: " + sueldob);

		} else if (sueldo >= 500) {
			System.out.println("No hay aumento " + sueldo);

		}

	}

}
