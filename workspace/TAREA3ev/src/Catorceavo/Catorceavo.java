package Catorceavo;

import java.util.Scanner;

public class Catorceavo {

	public static void main(String[] args) {

		Scanner dia1 = new Scanner(System.in);

		System.out.print("Numero uno: ");
		int num1 = dia1.nextInt();

		Scanner mes1 = new Scanner(System.in);
		System.out.print("Numero dos: ");
		int num2 = mes1.nextInt();

		Scanner año1 = new Scanner(System.in);
		System.out.print("Numero tres: ");
		int num3 = año1.nextInt();

		if (num1 > num2 & num1 > num3) {

			System.out.println("El numero 1 es el mayor, numero introducido: "
					+ num1);
		} else if (num2 > num1 & num2 > num3) {
			System.out.println("El numero 2 es el mayor, numero introducido: "
					+ num2);
		} else if (num3 > num1 & num3 > num1) {
			System.out.println("El numero 3 es el mayor, numero introducido: "
					+ num3);
		}

	}
}
