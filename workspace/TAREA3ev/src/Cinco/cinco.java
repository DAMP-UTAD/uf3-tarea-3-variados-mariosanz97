package Cinco;

import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.print("Mete numero: ");
		int num1 = num.nextInt();

		if (num1 > 0) {
			System.out.println("Numerospositivo");
		} else if (num1 == 0) {
			System.out.println("Numero es nulo");
		} else {
			System.out.println("Numero es negativo");

		}

	}

}
