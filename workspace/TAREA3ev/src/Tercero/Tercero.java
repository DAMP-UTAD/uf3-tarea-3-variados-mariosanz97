package Tercero;

import java.util.Scanner;

public class Tercero {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.print("Mete numero: ");
		int num1 = num.nextInt();

		if (num1 > 9) {
			System.out.println("Tiene mas de dos cifras");
		} else {

			System.out.println("No tiene dos cifras");
		}

	}

}
