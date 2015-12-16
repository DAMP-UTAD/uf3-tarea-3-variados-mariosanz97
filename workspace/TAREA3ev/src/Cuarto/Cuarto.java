package Cuarto;

import java.util.Scanner;

public class Cuarto {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.print("Mete numero: ");
		int num1 = num.nextInt();

		System.out.print("Mete numero: ");
		int num2 = num.nextInt();

		System.out.print("Mete numero: ");
		int num3 = num.nextInt();

		if (num1 > num2) {
			System.out.println("Numero 1 es el mayor ");
		} else if (num2 > num3) {
			System.out.println("Numero 2 es el mayor ");
		} else {
			System.out.println("Numero 3 es el mayor ");
		}

	}
}
